package ru.mirea.pr.pr10.ex2;

public class FunctionalChair implements Chair {
    public FunctionalChair() {}

    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "FunctionalChair";
    }
}