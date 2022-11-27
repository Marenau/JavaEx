package ru.mirea.pr.pr1516.order;

import ru.mirea.pr.pr1516.menu.Item;

public class ListNode {     //узел списка
    ListNode next;          //указатель на следующий узел
    Item value;             //значение узла

    public ListNode() {
        this(null);
    }               //конструкторы
    public ListNode(Item value) {
        this.value = value;
    }
}