package ru.mirea.pr.pr3;

import ru.mirea.pr.pr3.ex2.MovableRectangle;

public class Test {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(-1, 1, 1, -1, 1, 1);
        System.out.println(rectangle);
        rectangle.moveDown();
        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
