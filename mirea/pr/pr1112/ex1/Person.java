package ru.mirea.pr.pr1112.ex1;

public class Person {
    private String lastName, name, secondName;

    public Person() {
        lastName = "Иванов";
        name = "Иван";
        secondName = "Иванович";
    }
    public Person(String lastName) {
        this.lastName = lastName;
        name = "Иван";
        secondName = "Иванович";
    }
    public Person(String lastName, String name) {
        this.lastName = lastName;
        this.name = name;
        secondName = "Иванович";
    }
    public Person(String lastName, String name, String secondName) {
        this.lastName = lastName;
        this.name = name;
        this.secondName = secondName;
    }

    public String returnFIO() {
        StringBuilder stringBuilder = new StringBuilder(lastName);
        stringBuilder.append(" ").append(name.charAt(0)).append(".").
                append(secondName.charAt(0)).append(".");
        return  stringBuilder.toString();
    }
}