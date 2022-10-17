package ru.mirea.lab.lab9;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] arg) {
        Exception1 e = new Exception1();
        e.exceptionDemo();
    }
}