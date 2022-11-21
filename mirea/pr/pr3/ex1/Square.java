package ru.mirea.pr.pr3.ex1;

public class Square extends Rectangle {
    public Square() {};
    public Square(double side) { super(side, side); };
    public Square(double side, String color, boolean filled) { super(side, side, color, filled); };

    public double getSide() { return width; };
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) { super.setWidth(side); }
    @Override
    public void setLength(double side) { super.setLength(side); }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}