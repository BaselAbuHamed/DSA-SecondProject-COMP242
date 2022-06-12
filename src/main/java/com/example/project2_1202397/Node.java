package com.example.project2_1202397;

//create node method generic
public class Node <T extends Comparable<T>> {

    T data;
    int next;

    //create constructor
    public Node(T element) {
        this(element, 0);
    }

    //create constructor and add next parameter
    public Node(T element, int next) {
        this.data = element;
        this.next = next;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
