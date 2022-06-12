package com.example.project2_1202397;

public interface CursorInterface<T extends Comparable<T>> {
    void push(T data);

    Comparable<T> pop();

    Comparable<T> peek();

    boolean isEmpty();

    void clear();
}
