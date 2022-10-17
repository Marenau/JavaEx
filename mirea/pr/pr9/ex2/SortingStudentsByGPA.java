package ru.mirea.pr.pr9.ex2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student) o1).getGPA() - ((Student) o2).getGPA();
    }
}