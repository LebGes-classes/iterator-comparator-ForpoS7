package org.example;

public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;
    Node(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
}
