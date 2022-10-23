package ru.mirea.pr.pr7;

import java.util.*;

public class Test {
    public static void main(String[] arg) {
        alcoholicStack(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8, 0});
        alcoholicQueue(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8, 0});
        alcoholicDequeue(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8, 0});
        alcoholicDoubleList(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8, 0});
    }

    public static void alcoholicStack(int[] oneDeck, int[] twoDeck) {
        Stack<Integer> one = new Stack<Integer>();
        Stack<Integer> two = new Stack<Integer>();
        for (int i : oneDeck) one.add(0, i);
        for (int i : twoDeck) two.add(0, i);

        int i = 0;
        while (!one.empty() & !two.empty()) {
            int lastOne = one.lastElement();
            int lastTwo = two.lastElement();
            if (lastOne == 0 & lastTwo == 9) {
                two.pop();
                one.pop();
                one.add(0, lastTwo);
                one.add(0, lastOne);
                i++;
                continue;
            } else if (lastOne == 9 & lastTwo == 0) {
                one.pop();
                two.pop();
                two.add(0, lastTwo);
                two.add(0, lastOne);
                i++;
                continue;
            }
            if (lastOne > lastTwo) {
                two.pop();
                one.pop();
                one.add(0, lastTwo);
                one.add(0, lastOne);
            } else {
                one.pop();
                two.pop();
                two.add(0, lastOne);
                two.add(0, lastTwo);
            }
            i++;
        }
        if (one.empty()) System.out.println("Second " + i);
        else System.out.println("First " + i);
    }

    public static void alcoholicQueue(int[] oneDeck, int[] twoDeck) {
        Queue<Integer> one = new LinkedList<>();
        Queue<Integer> two = new LinkedList<>();

        for (int i : oneDeck) one.add(i);
        for (int i : twoDeck) two.add(i);

        int i = 0;
        while (!one.isEmpty() & !two.isEmpty()) {
            int lastOne = one.peek();
            int lastTwo = two.peek();
            if (lastOne == 0 & lastTwo == 9) {
                two.poll();
                one.poll();
                one.add(lastTwo);
                one.add(lastOne);
                i++;
                continue;
            } else if (lastOne == 9 & lastTwo == 0) {
                one.poll();
                two.poll();
                two.add(lastTwo);
                two.add(lastOne);
                i++;
                continue;
            }
            if (lastOne > lastTwo) {
                two.poll();
                one.poll();
                one.add(lastTwo);
                one.add(lastOne);
                i++;
            } else {
                one.poll();
                two.poll();
                two.add(lastOne);
                two.add(lastTwo);
                i++;
            }
        }
        if (one.isEmpty()) System.out.println("Second " + i);
        else System.out.println("First " + i);
    }

    public static void alcoholicDequeue(int[] oneDeck, int[] twoDeck) {
        Deque<Integer> one = new LinkedList<>();
        Deque<Integer> two = new LinkedList<>();

        for (int i : oneDeck) one.add(i);
        for (int i : twoDeck) two.add(i);

        int i = 0;
        while (!one.isEmpty() & !two.isEmpty()) {
            int lastOne = one.peek();
            int lastTwo = two.peek();
            if (lastOne == 0 & lastTwo == 9) {
                two.poll();
                one.poll();
                one.add(lastTwo);
                one.add(lastOne);
                i++;
                continue;
            } else if (lastOne == 9 & lastTwo == 0) {
                one.poll();
                two.poll();
                two.add(lastTwo);
                two.add(lastOne);
                i++;
                continue;
            }
            if (lastOne > lastTwo) {
                two.poll();
                one.poll();
                one.add(lastTwo);
                one.add(lastOne);
                i++;
            } else {
                one.poll();
                two.poll();
                two.add(lastOne);
                two.add(lastTwo);
                i++;
            }
        }
        if (one.isEmpty()) System.out.println("Second " + i);
        else System.out.println("First " + i);
    }

    public static void alcoholicDoubleList(int[] oneDeck, int[] twoDeck) {
        LinkedList<Integer> one = new LinkedList<>();
        LinkedList<Integer> two = new LinkedList<>();

        for (int i : oneDeck) one.add(i);
        for (int i : twoDeck) two.add(i);

        int i = 0;
        while (!one.isEmpty() & !two.isEmpty()) {
            int lastOne = one.peek();
            int lastTwo = two.peek();
            if (lastOne == 0 & lastTwo == 9) {
                two.poll();
                one.poll();
                one.add(lastTwo);
                one.add(lastOne);
                i++;
                continue;
            } else if (lastOne == 9 & lastTwo == 0) {
                one.poll();
                two.poll();
                two.add(lastTwo);
                two.add(lastOne);
                i++;
                continue;
            }
            if (lastOne > lastTwo) {
                two.poll();
                one.poll();
                one.add(lastTwo);
                one.add(lastOne);
                i++;
            } else {
                one.poll();
                two.poll();
                two.add(lastOne);
                two.add(lastTwo);
                i++;
            }
        }
        if (one.isEmpty()) System.out.println("Second " + i);
        else System.out.println("First " + i);
    }
}