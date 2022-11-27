package ru.mirea.lab.lab1516.order;

import ru.mirea.lab.lab1516.menu.MenuItem;

public class ListNode {     //узел списка
    ListNode next;          //указатель на следующий узел
    MenuItem value;         //значение узла

    public ListNode() {
        this(null);
    }                   //конструкторы
    public ListNode(MenuItem value) {
        this.value = value;
    }
}