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
}