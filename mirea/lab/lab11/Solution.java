package ru.mirea.lab.lab11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public <T> ArrayList<T> newArrayList (T[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Length of array is null");
        ArrayList<T> list = new ArrayList<>(arr.length);
        list.addAll(Arrays.asList(arr));
        return list;
    }

    public <T> HashSet<T> newHashSet(T[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Length of array is null");
        HashSet<T> list = new HashSet<>(arr.length);
        list.addAll(Arrays.asList(arr));
        return list;
    }

    public <K, V> HashMap<K, V> newHashMap(K[] arr1, V[] arr2) {
        if (arr1.length == 0 || arr2.length == 0)
            throw new IllegalArgumentException("Length of array is null");
        if (arr1.length != arr2.length)
            throw new IllegalArgumentException("Lengths of arrays aren't equal");
        HashMap<K, V> list = new HashMap<>();
        for (int i = 0; i < arr1.length; i++)
            list.put(arr1[i], arr2[i]);
        return list;
    }
}