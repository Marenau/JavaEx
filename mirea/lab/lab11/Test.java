package ru.mirea.lab.lab11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] arg) {
        Solution solution = new Solution();
        String[] arr = new String[]{"Hello", "world", "!"};
        ArrayList<String> arrayList = solution.newArrayList(arr);
        System.out.println(arrayList);
        HashSet<String> hashSet = solution.newHashSet(arr);
        System.out.println(hashSet);
        HashMap<String, String> hashMap = solution.newHashMap(arr, new String[]{"H", "w", "!"});
        System.out.println(hashMap);
    }
}