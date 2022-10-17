package ru.mirea.pr.pr9.ex2;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException() {
        super("Student not found!");
    }
}