package com.smelk;

import com.smelk.arraylistpractice.MyArrayList;
import com.smelk.linkedlistpractice.MyLinkedList;
import com.smelk.stackpractice.MyStack;
import com.smelk.stackpractice.OutOfScopeException;

public class CollectionsApp {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        System.out.println("Size after creation: " + myArrayList.size());
        myArrayList.add(1);
        myArrayList.add("String");
        myArrayList.add(3);
        System.out.println("Size after adding 3 elements: " + myArrayList.size());
        System.out.println("Getting item with index 1: " + myArrayList.get(1));
        myArrayList.remove(1);
        System.out.println("Getting item with index 1 after remove previous item with index 1: " + myArrayList.get(1));
        System.out.println("Size after removing one element: " + myArrayList.size());
        myArrayList.clear();
        System.out.println("Size after clear method: " + myArrayList.size() + "\n");

        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println("Size after creation: " + myLinkedList.size());
        myLinkedList.add(1);
        myLinkedList.add("String");
        myLinkedList.add(3);
        System.out.println("Size after adding 3 elements: " + myLinkedList.size());
        System.out.println("Getting item with index 1: " + myLinkedList.get(1));
        myLinkedList.remove(0);
        System.out.println("Getting item with index 1 after remove previous item with index 1: " + myLinkedList.get(1));
        System.out.println("Size after removing one element: " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("Size after clear method: " + myLinkedList.size() + "\n");

        MyStack myStack = new MyStack();
        System.out.println("Size after creation: " + myStack.size());
        myStack.push(0);
        myStack.push("Second");
        myStack.push("Third");
        myStack.push(4);
        System.out.println("Size after adding 4 elements: " + myStack.size());
        System.out.println("Show value from top: " + myStack.peek());
        System.out.println("Show value from top and delete: " + myStack.pop());
        System.out.println("Show value from top: " + myStack.peek());
        System.out.println("Size after delete value from top: " + myStack.size());
        myStack.remove(1);
        System.out.println("Show value from top after remove index 1: " + myStack.peek());
        System.out.println("Size after remove index 1: " + myStack.size());
        myStack.clear();
        System.out.println("Size after clear: " + myStack.size());
    }
}
