package ru.mirea.lab.lab1516.order.manager;

import ru.mirea.lab.lab1516.order.Order;

public class QueueNode {    //узел списка
    QueueNode next;         //указатель на следующий узел
    QueueNode prev;         //указатель на предыдущий узел
    Order value;            //заказ

    public QueueNode() { this(null); }              //конструкторы
    public QueueNode(Order value) { this.value = value; }
}