package ru.mirea.pr.pr1112.ex1;

public class Test {                                                                 //класс для тестирования
    public static void main(String[] arg) {                                         //основной алгоритм программы
        Person Malin = new Person("Малин");                                         //создание объекта класса Person
        System.out.println(Malin.returnFIO());                                      //вывод значения метода returnFIO объекта Malin
        Person Barsh = new Person("Барш", "Галина");                                //создание объекта класса Person
        System.out.println(Barsh.returnFIO());                                      //вывод значения метода returnFIO объекта Barsh
        Person Anastasiadi = new Person("Анастасиади", "Дмитрий", "Евстафьевич");   //создание объекта класса Person
        System.out.println(Anastasiadi.returnFIO());                                //вывод значения метода returnFIO объекта Anastasiadi
    }
}