package ru.mirea.lab.lab3;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book();
        Ball ball1 = new Ball();
        System.out.println("Цена книги: " + book1.getPrice());
        System.out.println("Цена мяча: " + ball1.getPrice());
    };
};