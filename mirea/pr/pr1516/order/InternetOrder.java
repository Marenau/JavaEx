package ru.mirea.pr.pr1516.order;
import ru.mirea.pr.pr1516.menu.Item;

public class InternetOrder implements Order {
    private ListNode head;
    private ListNode tail;

    public InternetOrder() {
        head = new ListNode();
        tail = new ListNode();
        head.next = tail;
    }
    public InternetOrder(Item[] items) {
        if (items.length == 0) return;
        for (int i = 0; i < items.length; i++)
            add(items[i]);
    }

    @Override
    public boolean add(Item item) {
        if (head.value == null) {
            head.value = item;
            return true;
        }
        if (tail.value == null) {
            tail.value = item;
            return true;
        }
        tail.next = new ListNode(item);
        tail = tail.next;
        return true;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode go = head;
        ListNode prevGo = null;

        while (go != null) {
            if (go.value.getName().equals(itemName)) {
                if (prevGo != null)
                    prevGo.next = head.next;
                if (head == tail)
                    tail = prevGo;
                head = head.next;
                return true;
            }
            prevGo = go;
            go = go.next;
        }

        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int counter = 0;
        while (!remove(itemName))
            counter++;
        return counter;
    }

    @Override
    public int itemsQuantity() {
        int counter = 0;
        ListNode go = head;
        while (go != null) {
            counter++;
            go = go.next;
        }
        return counter;
    }

    @Override
    public int itemQuantity(String itemName) {
        int counter = 0;
        ListNode go = head;
        while (go != null) {
            if (go.value.getName().equals(itemName)) counter++;
            go = go.next;
        }
        return counter;
    };

    @Override
    public Item[] getItems() {
        Item[] items = new Item[0];
        ListNode go = head;
        while (go != null) {
            boolean isFound = false;
            for (Item menuItem : items) {
                if (menuItem.equals(go.value)) {
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                Item[] temp = new Item[items.length + 1];
                System.arraycopy(items, 0, temp, 0, items.length);
                temp[temp.length - 1] = go.value;
                items = temp;
            }

            go = go.next;
        }
        return items;
    };

    @Override
    public double costTotal() {
        double cost = 0;
        ListNode go = head;
        while (go != null) {
            cost += go.value.getCost();
            go = go.next;
        }
        return cost;
    }

    @Override
    public String[] itemsNames() {
        String[] items = new String[0];
        ListNode go = head;
        while (go != null) {
            boolean isFound = false;
            for (String menuItem : items) {
                if (menuItem.equals(go.value)) {
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                String[] temp = new String[items.length + 1];
                System.arraycopy(items, 0, temp, 0, items.length);
                temp[temp.length - 1] = go.value.getName();
                items = temp;
            }

            go = go.next;
        }
        return items;
    };

    @Override
    public Item[] sortedItemsByCostDesc() {
        Item[] items = getItems();
        for (int i = 0; i < items.length; i++) {
            Item st = items[i];
            int j = i - 1;
            for (; (j >= 0) && (st.getCost() - items[j].getCost() < 0); j--)
                items[j + 1] = items[j];
            items[j + 1] = st;
        }
        return items;
    }
}