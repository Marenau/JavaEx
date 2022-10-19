package ru.mirea.lab.lab12;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] arg) {
        System.out.println(isThatString("abcdefghijklmnopqrstuv18340."));
        System.out.println(findValue("25.98 USD. 0.004 EU"));
        System.out.println(isNotState("1 + 3 + 5"));
        System.out.println(isNotState("(1 + 3) - 5"));
        System.out.println(isNotState("1 + 3 -5"));
        System.out.println(isDate("29/02/2000"));
        System.out.println(isDate("01/01/2003"));
        System.out.println(isDate("29/02/2001"));
        System.out.println(isDate("30-04-2003"));
        System.out.println(isDate("1/1/1899")); //начиная с 1900 года
        System.out.println(isEmail("user@example.com"));
        System.out.println(isEmail("root@localhost"));
        System.out.println(isEmail("myhost@@@com.ru"));
        System.out.println(isEmail("@my.ru"));
        System.out.println(isPassword("F032_Password"));
        System.out.println(isPassword("TrySpy1"));  //7 символов же
        System.out.println(isPassword("smart_pass"));
        System.out.println(isPassword("A007"));
    }

    public static boolean isThatString(String str) {
        return str.equals("abcdefghijklmnopqrstuv18340");
    }

    public static ArrayList<String> findValue(String str) {
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?\\s?((RUB)|(USD)|(EU))");
        Matcher matcher = pattern.matcher(str);
        ArrayList<String> arrayList = new ArrayList<>();
        while (matcher.find())
            arrayList.add(matcher.group());
        return arrayList;
    }

    public static boolean isNotState(String str) {
        Pattern pattern = Pattern.compile("\\d+([)])*\\s+([^+])+");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static boolean isDate(String str) {
        Pattern pattern = Pattern.compile("29/02/+(19([02468][048])|([3579][26])" +
                "| ([2-9]\\d([02468][048])|([3579][26]))) |" +
                "(\\d+/+\\d+/+((19)|(2))+\\d{2})");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static boolean isEmail(String str) {
        Pattern pattern = Pattern.compile("([a-z])+@([a-z])+(\\.)*");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static boolean isPassword(String str) {
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }
}