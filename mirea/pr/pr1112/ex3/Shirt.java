package ru.mirea.pr.pr1112.ex3;

public class Shirt {
    private String number, name, color, size;

    public Shirt(String str) {
        String[] strings = str.split(",");
        number = strings[0];
        name = strings[1];
        color = strings[2];
        size = strings[3];
    }

    @Override
    public String toString() {
        return "Shirt {" +
                "\n\tnumber='" + number + '\'' +
                ",\n\tname='" + name + '\'' +
                ",\n\tcolor='" + color + '\'' +
                ",\n\tsize='" + size + '\'' +
                '}';
    }
}