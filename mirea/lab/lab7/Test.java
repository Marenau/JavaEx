package ru.mirea.lab.lab7;

import java.util.ArrayList;

public class Test {
    public static void main(String[] arg) {
        ArrayList<String> myClassmates = new ArrayList<String>();
        myClassmates.add("Барш Галина");
        myClassmates.add("Доброхвалова Мария");
        myClassmates.add("Анастасиади Дмитрий");

        for (String name: myClassmates) System.out.println(name);

        myClassmates.remove(0);
        myClassmates.set(1, "Доброхвалов Иван");

        if (myClassmates.contains("Доброхвалов Иван")) System.out.println("\nВаня тут!\n");

        myClassmates.remove("Доброхвалов Иван");
        myClassmates.add("Матюхин Фёдор");

        for (String name: myClassmates) System.out.println(name);
    }
}