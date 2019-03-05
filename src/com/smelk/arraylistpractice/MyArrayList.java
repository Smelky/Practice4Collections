package com.smelk.arraylistpractice;

import com.smelk.List;

public class MyArrayList<T> implements List<T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int size = 0;

    public void add(T item) {
        if (size == array.length - 1) {
            resize(array.length * 2);
        } else {
            array[size++] = item;
        }
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
        if (array.length > INIT_SIZE && size < array.length / CUT_RATE)
            resize(array.length / 2);
    }

    public int size() {
        return size;
    }

    public void clear() {
        array = new Object[INIT_SIZE];
        size = 0;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
