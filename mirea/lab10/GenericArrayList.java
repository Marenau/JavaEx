package ru.mirea.lab10;

import java.util.*;

public class GenericArrayList<T> {
    private T[] list;
    private int size;

    public GenericArrayList() {
        size = 0;
        list = (T[]) new Object[size];
    }

    public GenericArrayList(int size) {
        this.size = size;
        list = (T[]) new Object[size];
    }

    public GenericArrayList(T[] array) {
        this.size = array.length;
        list = array;
    }

    public int getSize() { return size; }

    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public void clear() {
        for (int index = 0; index < size; index++)
            list[index] = null;
    }

    public T get(int index) {
        try {
            return list[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bounds!");
            return null;
        }
    }

    public boolean set(int index, T element) {
        try {
            list[index] = element;
            return true;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bounds!");
            return false;
        }
    }

    public boolean remove(int index) {
        try {
            list[index] = null;
            return true;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bounds!");
            return false;
        }
    }

    public int indexOf(T element) {
        if (isEmpty())
            throw new IllegalStateException("Array is empty!");
        for (int index = 0; index < size; index++)
            if (list[index].equals(element))
                return index;
        return -1;
    }

    public boolean add(T element) {
        for (int i = 0; i < size; i++) {
            if (list[i] == null) {
                list[i] = element;
                return true;
            }
        }
        list = Arrays.copyOf(list, size + 1);
        list[size] = element;
        size++;
        return true;
    }

    public boolean contains(T element) {
        if (isEmpty())
            throw new IllegalStateException("Array is empty!");
        for (int index = 0; index < size; index++)
            if (list[index].equals(element))
                return true;
        return false;
    }

    public boolean containsAll(Collection<T> collection) {
        ArrayList<T> arr = new ArrayList<>(collection);
        for (int i = 0; i < arr.size(); i++) {
            if (this.contains(arr.get(i))) continue;
            else return false;
        }
        return true;
    }

    public GenericArrayList<T> subList(int index1, int index2) {
        GenericArrayList<T> newArray = new GenericArrayList<>();
        try {
            for(int i = index1; i < index2; i++)
                newArray.add(list[i]);
            return newArray;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bounds!");
            return newArray;
        }
    }

    public void sort(Comparator<? super T> comp) {
        try {
            for (int i = 0; i < size; i++) {
                int maxElementIndex = i;
                for (int j = i + 1; j < size; j++)
                    if (comp.compare(list[maxElementIndex], list[j]) > 0)
                        maxElementIndex = j;
                if (maxElementIndex != i) {
                    T temp = list[i];
                    list[i] = list[maxElementIndex];
                    list[maxElementIndex] = temp;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Sorting is not possible. Fill in all the values.");
        }
    }

    @Override
    public String toString() {
        return "GenericArrayList { " +
                " list = " + Arrays.toString(list) +
                ", size = " + size +
                '}';
    }
}