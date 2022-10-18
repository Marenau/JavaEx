package ru.mirea.pr.pr10.ex2;

public class VictorianChair implements Chair {
    private int age;
    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() { return age; }

    @Override
    public String toString() {
        return "VictorianChair { " +
                "age = " + age +
                '}';
    }
}