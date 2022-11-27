package ru.mirea.lab.lab1516.exceptions;

public class IllegalAddressException extends Exception {
    public IllegalAddressException() {
        super("Некорректный адрес!");
    }
}