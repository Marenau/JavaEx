package ru.mirea.pr9.ex1;

import java.math.BigInteger;
import java.util.Scanner;

public class INN {

    public static void checkINN(BigInteger number) throws invalidINNException {
        BigInteger check = new BigInteger(number.toByteArray());
        int count = 0;
        while (!check.equals(new BigInteger("0"))) {
            check = new BigInteger(check.divide(new BigInteger("10")).toByteArray());
            count++;
        }
        if (count != 10 && count != 12) throw new invalidINNException(number);
    }

    public static void doINN() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String FIO = in.nextLine();
        System.out.println("Введите ИНН: ");
        try {
            BigInteger INN = in.nextBigInteger();
            checkINN(INN);
            System.out.println("Looks good!");
        } catch (invalidINNException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}