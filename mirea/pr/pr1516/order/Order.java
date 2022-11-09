package ru.mirea.pr.pr1516.order;

import ru.mirea.pr.pr1516.menu.Item;

public interface Order {
    boolean add(Item item);
    boolean remove(String itemName);
    int removeAll(String itemName);
    int itemsQuantity();
    Item[] getItems();
    double costTotal();
    int itemQuantity(String itemName);
    String[] itemsNames();
    Item[] sortedItemsByCostDesc();
}