package ru.mirea.lab.lab12;

import java.util.Arrays;
import java.util.Scanner;

public class Manipulator {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the text");
        String text = scanner.nextLine();
        System.out.println("Write the pattern");
        String patter = scanner.nextLine();
        text = Arrays.toString(text.split(patter));
        System.out.println("Divided text:");
        System.out.println(text);
    }
}