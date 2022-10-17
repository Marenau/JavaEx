package ru.mirea.lab.lab9;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Some troubles... Oooooops...");
        } catch (Exception e) {
            System.out.println("This is so strange...");
        }
    }

    public static void main(String[] arg) {
        Exception3 e = new Exception3();
        e.exceptionDemo();
    }
}