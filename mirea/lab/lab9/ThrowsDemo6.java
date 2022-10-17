package ru.mirea.lab.lab9;

import java.util.Scanner;

public class ThrowsDemo6 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) {
        try {
            if (key == "1") {    //так нельзя сравнивать строки
                throw new Exception("Key set to empty string");
            }
        } catch (Exception e) {
            e.printStackTrace();;
        }
        return "data for " + key;
    }

    public static void main(String[] arg) {
        ThrowsDemo6 e = new ThrowsDemo6();
        e.getKey();
    }
}