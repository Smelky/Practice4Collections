package com.smelk;

public interface List<T> {
    T get(int index);

    void add(T t);

    void remove(int i);

    int size();

    void clear();
}
