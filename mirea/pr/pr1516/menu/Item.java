package ru.mirea.pr.pr1516.menu;

public interface Item extends Comparable {
    String getName();
    String getDescription();
    double getCost();
}