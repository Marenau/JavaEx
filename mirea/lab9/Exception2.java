package ru.mirea.lab9;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Some troubles... Oooooops...");
        }
    }

    public static void main(String[] arg) {
        Exception2 e = new Exception2();
        e.exceptionDemo();
    }
}