package com.smelk.stackpractice;

public class NodeStack<T> {
    public NodeStack<T> next;
    public T data;

    public NodeStack(T data, NodeStack<T> next) {
        this.data = data;
        this.next = next;
    }
}
