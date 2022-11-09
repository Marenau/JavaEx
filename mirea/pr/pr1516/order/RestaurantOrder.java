package ru.mirea.pr.pr1516.order;
import ru.mirea.pr.pr1516.menu.Item;

import java.util.Arrays;

public class RestaurantOrder implements Order {
    private int size;
    private Item[] items;

    public RestaurantOrder() {
        size = 0;
        items = new Item[0];
    }

    private void addEmptyLastIndex() {
        Item[] temp = new Item[items.length + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        items = temp;
        size++;
    }

    private void removeElementByIndex(int index) {
        Item[] temp = new Item[items.length - 1];
        System.arraycopy(items, 0, temp, 0, index);
        System.arraycopy(items, index + 1, temp, index, items.length - index - 1);
        items = temp;
        size--;
    }

    @Override
    public boolean add(Item item) {
        addEmptyLastIndex();
        items[size - 1] = item;
        return true;
    }

    @Override
    public boolean remove(String itemName) {
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                removeElementByIndex(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        while (remove(itemName))
            count++;
        return count;
    }

    @Override
    public int itemsQuantity() { return size; }

    @Override
    public Item[] getItems() { return items; }

    @Override
    public double costTotal() {
        int totalCost = 0;
        for (int i = 0; i < size; i++)
            totalCost += items[i].getCost();
        return totalCost;
    }

    @Override
    public int itemQuantity(String itemName) {
        int counter = 0;
        for (int i = 0; i < size; i++)
            if (items[i].getName().equals(itemName))
                counter++;
        return counter;
    }

    @Override
    public String[] itemsNames() {
        String[] strings = new String[0];
        for (int i = 0; i < size; i++) {
            boolean isFound = false;
            for (String menuItem : strings) {
                if (menuItem != null && menuItem.equals(items[i].getName())) {
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                String[] temp = new String[strings.length + 1];
                System.arraycopy(strings, 0, temp, 0, strings.length);
                temp[temp.length - 1] = items[i].getName();
                strings = temp;
            }
        }
        return strings;
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        Item[] sortItems = new Item[items.length];
        System.arraycopy(items, 0, sortItems, 0, items.length);
        for (int i = 0; i < sortItems.length; i++) {
            Item st = sortItems[i];
            int j = i - 1;
            for (; (j >= 0) && (st.getCost() - sortItems[j].getCost() < 0); j--)
                sortItems[j + 1] = sortItems[j];
            sortItems[j + 1] = st;
        }
        return sortItems;
    }
}