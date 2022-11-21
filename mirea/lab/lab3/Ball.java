package ru.mirea.lab.lab3;

public class Ball implements Priceable {
    private double radius;
    private String color;
    private double price;

    { price = 50; };

    public Ball() {
        radius = 1.0d;
        color = "red";
    };
    public Ball(double r) {
        radius = r;
        color = "red";
    };
    public Ball(double r, String c) {
        radius = r;
        color = c;
    };

    public void SetRadius(int radius) { this.radius = radius; };
    public void SetColor(String color) { this.color = color; };

    public double getRadius() { return radius; };
    public String getColor() { return color; };
    public double getArea() {return radius * radius * Math.PI; };

    @Override
    public double getPrice() { return price; };

    public String toString() { return "Радиус: " + radius + " Цвет: " + color; };
};