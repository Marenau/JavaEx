package ru.mirea.pr.pr1112.ex5;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static String getLine(String str) {
        String[] sstrings = str.split(" ");
        ArrayList<String> strings = new ArrayList<>(sstrings.length);
        Collections.addAll(strings, sstrings);
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(strings.get(0)).append(" ");
        for (int i = 0; i < strings.size() - 1; i++) {
            String sI = strings.get(i);
            for (int j = i + 1; j < strings.size() - 1; j++) {
                String sJ = strings.get(j);
                if ( sI.substring(sI.length() - 1)
                        .equalsIgnoreCase(sJ.substring(0, 1)) ) {
                    stringBuilder.append(sJ).append(" ");
                    strings.set(j, strings.get(i + 1));
                    strings.set(i + 1, sJ);
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(path);
            int c;
            while ( (c = fileReader.read()) != -1)
                stringBuilder.append( (char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(getLine(stringBuilder.toString()));
    }
}