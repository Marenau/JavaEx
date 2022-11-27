package ru.mirea.lab.lab1516.order.manager;

import ru.mirea.lab.lab1516.menu.MenuItem;
import ru.mirea.lab.lab1516.order.Order;

public interface OrdersManager {        //интерфейс менеджера заказов
    int itemsQuantity(String itemName); //метод получение количества позиций
    int itemsQuantity(MenuItem item);   //метод получение количества позиций
    Order[] getOrders();                //метод получения массива заказов
    int ordersCostSummary();            //метод вычисления стоимости всех заказов
    int ordersQuantity();               //метод вычисления количества заказов
}