package ru.mirea.pr.pr1516.exceptions;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException() {
        super("Such an order has already been created!");
    }
}