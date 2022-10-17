package ru.mirea.lab.lab9;

import java.util.Scanner;

public class Exception4 {
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
        } finally {
            System.out.println("We are done! Thank you for watching!!!");
        }
    }

    public static void main(String[] arg) {
        Exception4 e = new Exception4();
        e.exceptionDemo();
    }
}