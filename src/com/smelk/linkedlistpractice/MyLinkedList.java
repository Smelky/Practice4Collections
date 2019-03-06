package com.smelk.linkedlistpractice;

import com.smelk.List;

public class MyLinkedList<T> implements List<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    public MyLinkedList() {
        first = new Node();
        last = first;
        size = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        Node<T> head = first;
        while (index > 0) {
            head = head.next;
            index--;
        }
        return head.value;
    }

    @Override
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

    @Override
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

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i <= size; i++) {
            remove(0);
        }
    }

    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;
    }
}
