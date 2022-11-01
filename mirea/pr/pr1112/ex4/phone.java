package ru.mirea.pr.pr1112.ex4;

public class phone {
    private String code, three1, three2, four;

    public phone(String str) {
        four = str.substring(str.length() - 4);
        three2 = str.substring(str.length() - 7, str.length() - 4);
        three1 = str.substring(str.length() - 10, str.length() - 7);
        String temp = str.substring(0, str.length() - 10);
        if (str.startsWith("+"))
            code = temp;
        else
            code = "+" + String.valueOf(Integer.parseInt(temp) - 1);
    }

    @Override
    public String toString() {
        return "phone = " + code + three1 + "-" + three2 + "-" + four;
    }
}