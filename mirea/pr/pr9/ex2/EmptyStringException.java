package ru.mirea.pr.pr9.ex2;

public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("Empty string!");
    }
}