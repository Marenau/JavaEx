package ru.mirea.pr.pr1516.order;

import ru.mirea.pr.pr1516.exceptions.IllegalTableNumber;
import ru.mirea.pr.pr1516.exceptions.OrderAlreadyAddedException;
import ru.mirea.pr.pr1516.menu.Item;

import java.util.HashMap;

public class OrderManager {
    private Order[] orders;
    private HashMap<String, Order> pairs;

    public OrderManager() {
        this(10);
    }
    public OrderManager(int tableCount) {
        orders = new Order[tableCount];
    }

    public void add(Order order, int tableNumber) throws OrderAlreadyAddedException, IllegalTableNumber {
        if (orders[tableNumber] != null) throw new OrderAlreadyAddedException();
        if (tableNumber > orders.length - 1) throw new IllegalTableNumber();
        orders[tableNumber] = order;
    }

    public void addItem(Item item, int tableNumber) throws OrderAlreadyAddedException, IllegalTableNumber {
        if (orders[tableNumber] == null) throw new OrderAlreadyAddedException();
        if (tableNumber > orders.length - 1) throw new IllegalTableNumber();
        orders[tableNumber].add(item);
    }

    public int freeTableNumber() {
        for (int i = 0; i < orders.length; i++)
            if (orders[i] == null) return i;
        return 0;
    }

    public int[] freeTableNumbers() {
        int[] nums = new int[0];
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                int[] temp = new int[nums.length + 1];
                System.arraycopy(nums, 0, temp, 0, nums.length);
                temp[temp.length - 1] = i;
                nums = temp;
            }
        }
        return nums;
    }

    public Order getOrder(int tableNumber) throws IllegalTableNumber {
        if (tableNumber > orders.length - 1) throw new IllegalTableNumber();
        return orders[tableNumber];
    }

    public void remove(int tableNumber) throws IllegalTableNumber {
        if (tableNumber > orders.length - 1) throw new IllegalTableNumber();
        orders[tableNumber] = null;
    }

    public boolean remove(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].equals(order)) {
                orders[i] = null;
                return true;
            }
        }
        return false;
    }

    public int removeAll(Order order) {
        int count = 0;
        while (remove(order))
            count++;
        return count;
    }


    public void add(String tableNumber, Order order) throws OrderAlreadyAddedException, IllegalTableNumber {
        if (pairs.get(tableNumber) != null) throw new OrderAlreadyAddedException();
        if (Integer.parseInt(tableNumber) > orders.length - 1) throw new IllegalTableNumber();
        pairs.put(tableNumber, order);
    }

    public Order getOrder(String tableNumber) throws IllegalTableNumber {
        if (Integer.parseInt(tableNumber) > orders.length - 1) throw new IllegalTableNumber();
        return pairs.get(tableNumber);
    }

    public boolean remove(String tableNumber) throws IllegalTableNumber {
        if (Integer.parseInt(tableNumber) > orders.length - 1) throw new IllegalTableNumber();
        if (pairs.remove(tableNumber) != null)
            return true;
        return false;
    }

    public void addItem(String tableNumber, Item item) throws OrderAlreadyAddedException, IllegalTableNumber {
        if (pairs.get(tableNumber) == null) throw new OrderAlreadyAddedException();
        if (Integer.parseInt(tableNumber) > orders.length - 1) throw new IllegalTableNumber();
        pairs.get(tableNumber).add(item);
    }

    public Order[] getOrders() {
        Order[] orders = new Order[pairs.size()];
        int i = 0;
        for (Order order : pairs.values())
            orders[i++] = order;
        return orders;
    }

    public double costTotal() {
        double cost = 0;
        for (Order order : pairs.values())
            cost += order.costTotal();
        return cost;
    }

    public int getDish(String dishName) {
        int counter = 0;
        for (Order order : pairs.values())
            counter += order.itemQuantity(dishName);
        return counter;
    }
}