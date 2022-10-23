package ru.mirea.pr.pr1112.ex2;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, corpus, apartment;

    public Address(String str, boolean comma) {
        if (str == null)
            throw new IllegalArgumentException("String is empty!");
        String[] strings;
        if (comma) strings = str.split(",");
        else {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",.;");
            strings = new String[stringTokenizer.countTokens()];
            for (int i = 0; stringTokenizer.hasMoreTokens(); i++)
                strings[i] = stringTokenizer.nextToken();
        }

        if (strings.length < 7) throw new IllegalArgumentException("String not collect 7 elements!");

        country = strings[0].trim();
        region = strings[1].trim();
        city = strings[2].trim();
        street = strings[3].trim();
        house = strings[4].trim();
        corpus = strings[5].trim();
        apartment = strings[6].trim();
    }

    @Override
    public String toString() {
        return "Address {" +
                "\n\tcountry = '" + country + '\'' +
                ",\n\tregion = '" + region + '\'' +
                ",\n\tcity = '" + city + '\'' +
                ",\n\tstreet = '" + street + '\'' +
                ",\n\thouse = '" + house + '\'' +
                ",\n\tcorpus = '" + corpus + '\'' +
                ",\n\tapartment = '" + apartment + '\'' +
                '}';
    }
}