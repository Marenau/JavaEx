package ru.mirea.pr.pr1516.order;
import ru.mirea.pr.pr1516.menu.Item;

public class ListNode {
    ListNode next;
    Item value;

    public ListNode() {
        this(null);
    }
    public ListNode(Item value) {
        this.value = value;
    }
}