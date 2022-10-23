package ru.mirea.pr.pr1112.ex2;

public class Test {
    public static void main(String[] arg) {
        Address a1 = new Address("Российская Федерация, ГФЗ Москва, " +
                "город Москва, улица Кунцевская, дом 1, отсутствует , квартира 39", true);
        System.out.println(a1);
        Address a2 = new Address("Российская Федерация , ГФЗ Москва; " +
                "город Москва   . улица Кунцевская; дом 1    , отсутствует . квартира 39", false);
        System.out.println(a2);
//        Address a3 = new Address("", true);
//        System.out.println(a3);
        Address a4 = new Address(" , , , , , , ,", true);
        System.out.println(a4);
    }
}