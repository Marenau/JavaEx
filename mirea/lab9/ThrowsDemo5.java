package ru.mirea.lab9;

public class ThrowsDemo5 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            key = "\"you messed up!\"";
        }
        return "data for " + key;
    }

    public static void main(String[] arg) {
        ThrowsDemo5 e = new ThrowsDemo5();
        e.printMessage(null);
        e.printMessage("Key");
    }
}