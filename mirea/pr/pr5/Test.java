package ru.mirea.pr.pr5;

import java.util.Scanner;
import java.lang.Math;

public class Test {

    public static int maxCount(int max, int count) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number == 0) return count;
        else if (number == max) return maxCount(max, ++count);
        else if (number > max) return maxCount(number,1);
        else return maxCount(max, count);
    }

    public static void printTrSeq(int n) {
        if (n != 1) {
            printTrSeq(n - 1);
        }
        int j = 0;
        for (int i = 0; j < n; i++) {
            System.out.print(n + ", ");
            j++;
        }
    }

    public static int maxNumber() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number == 0) return 0;
        else return Math.max(number, maxNumber());
    }

    public static void main(String[] args) {
        System.out.println(maxCount(0, 0));
        printTrSeq(10);
        System.out.println(maxNumber());
    }
}