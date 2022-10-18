package ru.mirea.lab.lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static <T> ArrayList<T> converter(T[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Length of array is null");
        ArrayList<T> list = new ArrayList<>(arr.length);
        list.addAll(Arrays.asList(arr));
        return list;
    }

    public static <E> E get(E[] arr, int index) {
        if (index < 0 || index > arr.length)
            throw new IndexOutOfBoundsException("Array size = "+ arr.length + ", index = " + index);
        return arr[index];
    }

    public static <T> void saveContent(T[] arr) {
        ArrayList<T> list = new ArrayList<T>(arr.length);
        Collections.addAll(list, arr);
        try {
            for (int i = 0; i < 5; i++)
            System.out.println(list.get(i));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] arg) {
        Integer[] arr1 = new Integer[]{1, 2, 3};
        String[] arr2 = new String[]{"Hello", "world", "!", "!", "!"};
        ArrayList<String> arr3 = converter(arr2);
//        System.out.println(arr3);
//        System.out.println(get(arr1, 0));
//        System.out.println(get(arr1, 10));
//        saveContent(arr2);
//        saveContent(arr1);

        //Ex two
        GenericArrayList<Integer> arr4 = new GenericArrayList<>(6);
        arr4.set(0, 4);
        arr4.set(3, 9);
        arr4.add(6);
        arr4.add(8);
        arr4.add(2);
        arr4.add(1);
        System.out.println(arr4);
        arr4.sort(Integer::compareTo);
        arr4.remove(3);
        System.out.println(arr4);
        System.out.println(arr4.subList(1, 5));
        System.out.println(arr4.contains(2));
        System.out.println();

        Integer[] list = new Integer[]{1, 4, 3, 8, 2};
        GenericArrayList<Integer> arr5 = new GenericArrayList<>(list);
        System.out.println(arr5);
        System.out.println(arr5.indexOf(8));
        System.out.println(arr5.get(4));
        System.out.println(arr5.containsAll(converter(new Integer[]{1, 2, 8})));
        arr5.clear();
        System.out.println(arr5);
    }
}