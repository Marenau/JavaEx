package ru.mirea.pr.pr10.ex2;

public class FunctionalChair implements Chair {     //класс функционального стула
    public FunctionalChair() {}                     //констурктор

    public int sum(int a, int b) {
        return a + b;
    }   //метод, возвращающий сумму двух целых чисел

    @Override
    public String toString() {
        return "FunctionalChair";
    }   //переопределённый метод toString
}