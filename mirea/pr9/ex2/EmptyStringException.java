package ru.mirea.pr9.ex2;

public class EmptyStringException extends Exception{
    public EmptyStringException() { super("Пустая строка!"); }
}