package ru.mirea.pr.pr10.ex2;

public class Client {
    public Chair chair;

    public void sit() {};

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Client { " +
                "chair = " + chair +
                '}';
    }
}