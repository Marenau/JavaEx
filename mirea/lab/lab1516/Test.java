package ru.mirea.lab.lab1516;

import ru.mirea.lab.lab1516.menu.Dish;
import ru.mirea.lab.lab1516.menu.Drink;
import ru.mirea.lab.lab1516.menu.DrinkTypeEnum;
import ru.mirea.lab.lab1516.menu.MenuItem;
import ru.mirea.lab.lab1516.order.InternetOrder;
import ru.mirea.lab.lab1516.order.Order;
import ru.mirea.lab.lab1516.order.TableOrder;

public class Test {
    public static void main(String[] args) {
        Order order1 = new TableOrder();
        order1.add(new Dish("Цезарь", "Вкусный салат", 360));
        order1.add(new Drink("Пряный чай Латте", "Пряный чай", 210, 0, DrinkTypeEnum.TEA));
        order1.add(new Dish("Цезарь", "Вкусный салат", 360));
        order1.add(new Dish("Цезарь", "Вкусный салат", 360));
        System.out.println(order1.costTotal());
        System.out.println(order1.itemQuantity("Цезарь"));
        System.out.println(order1.remove("Цезарь"));
        System.out.println(order1.itemsQuantity());
        for (String s: order1.itemsNames())
            System.out.println(s);
        order1.add(new Dish("Цезарь", "Вкусный салат", 360));
        System.out.println(order1.removeAll("Цезарь"));
        for (MenuItem item : order1.sortedItemsByCostDesc())
            System.out.println(item.getName());

        //Интернет-заказ
        Order order2 = new InternetOrder();
        order2.add(new Drink("Вода", "Газированная вода", 60, 0, DrinkTypeEnum.WATER));
        order2.add(new Dish("Котлета по-киевски", "Киевская коктлета", 600));
        order2.add(new Dish("Цезарь", "Вкусный салат", 360));
        order2.add(new Drink("Чай", "Чёрный чай", 35, 0, DrinkTypeEnum.TEA));
    }
}

