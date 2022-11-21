package ru.mirea.pr.pr10.ex1;

public class Test {                                                         //класс для тестирования
    public static void main(String[] arg) {                                 //основной алгоритм программы
        ConcreteFactory complexFactory = new ConcreteFactory();             //создание фабрики
        System.out.println(complexFactory.CreateComplex(2, -1)); //вывод созданного фабрикой объекта
        System.out.println(complexFactory.createComplex());                 //вывод созданного фабрикой объекта
    }
}