package com.smelk.linkedlistpractice;

import com.smelk.OutOfScopeException;

public class MyLinkedList<T> {
    private int size;
    private Node<T> first;
    private Node last;

    public MyLinkedList() {
        first = new Node<>(null, null, null);
        last = first;
        size = 0;
    }

    public void add(T item) {
        Node<T> newNode = new Node<>(last, item, null);
        if (size == 0) {
            first = newNode;
        }

        last.next = newNode;
        last.prev = last;
        last = newNode;
        size++;
    }

    public void remove(int i) throws OutOfScopeException {
        Node<T> x = getNode(i);
        if (x != null) {
            remove(x);
        }
    }

    private void remove(Node<T> node) {
        Node<T> prev = node.prev;
        Node<T> next = node.next;
        if (prev == null) {
            first = node.next;
        } else if (next == null) {
            last = node.prev;
        } else {
            prev.next = next;
            next.prev = prev;
            node.next = null;
            node.prev = null;
        }
        node.data = null;
        size--;

    }

    private Node<T> getNode(int index) throws OutOfScopeException {
        if (index < 0 || index >= size) {
            throw new OutOfScopeException("Index is out of scope!");
        } else if (index < size / 2) {
            Node<T> item = first;
            for (int i = 0; i < index; i++) {
                item = item.next;
            }
            return item;
        } else {
            Node<T> item = last;
            for (int i = size - 1; i > index; i--) {
                item = item.prev;
            }
            return item;
        }
    }


    public void clear() throws OutOfScopeException {
        for (int i = 0; i <= size; i++) {
            remove(0);
        }
    }

    public int size() {
        return size;
    }

    public T get(int i) throws OutOfScopeException {
        return getNode(i).data;
    }
}
