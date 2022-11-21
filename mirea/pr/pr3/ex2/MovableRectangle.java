package ru.mirea.pr.pr3.ex2;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "Rectangle (" +
                topLeft.x + ", " +
                topLeft.y + ", " +
                bottomRight.x + ", " +
                bottomRight.y + " )";
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveDown();
    }
    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    @Override
    public void moveLeft() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
    @Override
    public void moveRight() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
}