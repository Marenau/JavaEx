package ru.mirea.pr.pr1112.ex1;

public class Test {
    public static void main(String[] arg) {
        Person Malin = new Person("Малин");
        System.out.println(Malin.returnFIO());
        Person Barsh = new Person("Барш", "Галина");
        System.out.println(Barsh.returnFIO());
        Person Anastasiadi = new Person("Анастасиади", "Дмитрий", "Евстафьевич");
        System.out.println(Anastasiadi.returnFIO());
    }
}