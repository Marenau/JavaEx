package ru.mirea.pr.pr1112.ex4;

public class Test {                             //класс для тестирования
    public static void main(String[] args) {    //основной алгоритм программы
        System.out.println(new Phone("89685186019"));   //вывод на экран новых объектов класса Phone
        System.out.println(new Phone("+79685186019"));
        System.out.println(new Phone("+1234567890123"));
        System.out.println(new Phone("1244567890123"));
    }
}