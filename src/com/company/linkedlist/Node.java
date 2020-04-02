package com.company.linkedlist;

public class Node {
    int data;
    Node next;
    public Node(int d){
        // Constructor to create a new node
        data = d;
        next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
