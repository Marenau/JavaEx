package ru.mirea.pr.pr1516.exceptions;

public class IllegalTableNumber extends Exception {
    public IllegalTableNumber() {
        super("There is no table with such a number!");
    }
}
