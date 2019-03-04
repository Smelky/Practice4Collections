package com.smelk.linkedlistpractice;

public class MyLinkedList<T> {
    private int size;
    private Node first;
    private Node last;

    public MyLinkedList() {
        first = new Node();
        last = first;
        size = 0;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        Node head = first;
        while (index > 0) {
            head = head.next;
            index--;
        }
        return head.value;
    }

    public void add(T t) {
        if (size == 0) {
            first.value = t;
            last = first;
        } else {
            Node newNode = new Node();
            newNode.value = t;
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void remove(int i) {
        if (i >= 0 && i < size) {
            Node head = first;
            while (i > 0) {
                head = head.next;
                i--;
            }
            if (head.prev == null) {
                first = first.next;
                if (first != null) {
                    first.prev = null;
                }
            } else {
                head.prev.next = head.next;
            }
            if (head.next == null) {
                last = last.prev;
                if (last != null) {
                    last.next = null;
                }
            } else {
                head.next.prev = head.prev;
            }
            size--;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i <= size; i++) {
            remove(0);
        }
    }

    private class Node {
        T value;
        Node next;
        Node prev;
    }
}
