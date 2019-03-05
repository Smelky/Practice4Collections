package com.smelk.stackpractice;

public class MyStack<T> {
    private NodeStack<T> top;
    private int size;

    public MyStack() {
        top = new NodeStack<>(null, null);
        size = 0;
    }

    public void push(T item) {
        NodeStack<T> node = new NodeStack<>(item, top);
        top = node;
        size++;
    }

    public T pop() {
        if (stackIsEmpty()) {
            throw new StackIsEmptyException("Stack is empty!");
        }
        NodeStack<T> temp = top;
        top = top.next;
        size--;
        return temp.data;
    }

    public T peek() {
        if (stackIsEmpty()) {
            throw new StackIsEmptyException("Stack is empty!");
        }
        return top.data;
    }

    public int size() {
        return size;
    }

    public void clear() {
        int oldSize = size;
        for (int i = 0; i < oldSize; i++) {
            pop();
        }
    }

    public void remove(int index) {
        if (stackIsEmpty()) {
            throw new StackIsEmptyException("Stack is empty!");
        }
        if (index >= size || index < 0) {
            throw new OutOfScopeException("Index is out of scope!");
        }
        if (index == 0) {
            pop();
        } else {
            NodeStack<T> prev = top;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            remove(prev);
        }
    }

    private void remove(NodeStack<T> prev) {
        NodeStack<T> node = prev.next;
        if (node.next == null) {
            prev.next = null;
        } else {
            prev.next = node.next;
        }
        size--;
    }

    private boolean stackIsEmpty() {
        return size == 0;
    }
}
