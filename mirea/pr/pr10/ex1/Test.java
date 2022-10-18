package ru.mirea.pr.pr10.ex1;

public class Test {
    public static void main(String[] arg) {
        ConcreteFactory complexFactory = new ConcreteFactory();
        System.out.println(complexFactory.CreateComplex(2, -1));
        System.out.println(complexFactory.createComplex());
    }
}