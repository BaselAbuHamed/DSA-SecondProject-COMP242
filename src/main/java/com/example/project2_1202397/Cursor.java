package com.example.project2_1202397;

//LIFO: last in first out
//create method cursor generic
public class Cursor<T extends Comparable<T>> {

    //create object from node
    private final Node<T>[] cursorArray;

    //create constructor for cursor and parameter capacity to select the capacity
    public Cursor(int capacity) {
        cursorArray = new Node[capacity];//initialized value to variable cursorArray
        initialization();
    }

    //method initialization to create node
    private void initialization() {
        for (int i = 0; i < cursorArray.length; i++)
            // i+1 since the 0 references the empty list and at initialization
            // its reference
            // begins with 1 to the length of array
            cursorArray[i] = new Node<>(null, i + 1);
        // takes last index and makes it point to 0 as a way to know that we
        // reached end
        // of list
        cursorArray[cursorArray.length - 1] = new Node<>(null, 0);
    }

    // takes an element from a free list to use it
    private int malloc() {
        int p = cursorArray[0].getNext();
        cursorArray[0].setNext(cursorArray[p].getNext());
        return p;
    }

    // frees an index and return it to free list
    private void free(int p) {
        // makes Node p empty and points to the zeros next in a free list
        cursorArray[p] = new Node<>(null, cursorArray[0].getNext());
        // zeros next becomes the new freed Node of p
        cursorArray[0].setNext(p);
    }

    // Checks if a specified list is null or not(created or not)
    public boolean isNull(int l) {
        return cursorArray[l].getData() == null;
    }

    // Checks if a given list is empty
    public boolean isEmpty(int l) {
        return cursorArray[l].getNext() == 0;
    }

    // checks if a given Node is the last Node
    public boolean isLast(int p) {
        return cursorArray[p].getNext() == 0;
    }

    // creating a new Linked list
    public int createList() {
        // allocating one free node using malloc function
        int l = malloc();
        if (l == 0)
            System.out.println("Error: Out of space!!");
        else
            // makes next of new Node to 0 to show where it ends
            cursorArray[l] = new Node<>((T)"-", 0);
        return l;
    }

    // add a node at head at specified linked list
    public boolean insertAtHead(T data, int l) {
        if (isNull(l)) // list not created
            return false;

        int p = malloc();
        if (p != 0) {
            cursorArray[p] = new Node<>(data, cursorArray[l].getNext());
            cursorArray[l].setNext(p);
        } else {
            // System.out.println("Error: Out of space");
            return false;
        }
        return true;
    }

    //get the first element from cursor
    public Comparable<T> getFirst(int l) {
        if (isNull(l) || isEmpty(l))
            return null;
        return cursorArray[cursorArray[l].getNext()].getData();
    }

    //to remove element selected
    public void clear(int l) {
        while (!isNull(l) && !isEmpty(l)) {
            free(l);
            l = cursorArray[l].getNext();
        }
    }

    //to remove the first element selected
    public Comparable<T> deleteFirst(int l) {
        if (isNull(l) || isEmpty(l))
            return null;
        int deleteThis = cursorArray[l].getNext();
        Node<T> toDel = cursorArray[deleteThis];
        cursorArray[l].setNext(toDel.getNext());
        free(deleteThis);
        return toDel.getData();
    }
}
