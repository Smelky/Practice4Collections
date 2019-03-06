package com.smelk.stackpractice;

public class NodeStack<T> {
    private NodeStack<T> next;
    private T data;

    public NodeStack<T> getNext() {
        return next;
    }

    public void setNext(NodeStack<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeStack(NodeStack<T> next, T data) {
        this.next = next;
        this.data = data;
    }
}
