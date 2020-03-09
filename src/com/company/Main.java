package com.company;


import linkedlist.LinkedList;
import linkedlist.Node;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code
        LinkedList list = new LinkedList(new Node(3));
        list.insert(new Node(39));
        list.insert(new Node(7));
        list.insert(new Node(9));
        list.insert(new Node(15));
        list.print();
        list.delete(69);
        list.print();
        list.insertAtMiddleSlowFastMethod(85);
        list.print();
        list.InsertAtMiddle(6);
        list.print();
    }
}
