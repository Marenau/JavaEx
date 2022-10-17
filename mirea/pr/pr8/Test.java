package ru.mirea.pr.pr8;

import java.util.ArrayList;

public class Test {
    public static void main(String[] arg) {
        WaitList<String> wt1 = new WaitList<>();
        wt1.add("Вадим Малин");
        wt1.add("Максим Пальянов");
        wt1.add("Галина Барш");
        System.out.println(wt1);
        System.out.println(wt1.isEmpty());
        System.out.println(wt1.contains("Максим Пальянов"));
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Вадим Малин");
        arr.add("Максим Пальянов");
        arr.add("Галина Барш");
        System.out.println(wt1.containsAll(arr));

        BoundedWaitList<String> bwl1 = new BoundedWaitList<>(3);
        bwl1.add("Вадим Малин");
        bwl1.add("Максим Пальянов");
        bwl1.add("Галина Барш");
        System.out.println(bwl1);
//        try { bwl1.add("Елизавета Модина"); }
//        catch (Exception e) { e.printStackTrace(); }

        UnfairWaitList<String> uwl1 = new UnfairWaitList<>();
        uwl1.add("Вадим Малин");
        uwl1.add("Максим Пальянов");
        uwl1.add("Галина Барш");
        System.out.println(uwl1);
        uwl1.remove("Максим Пальянов");
        System.out.println(uwl1);
        uwl1.moveToBack("Галина Барш");
        System.out.println(uwl1);
    }
}