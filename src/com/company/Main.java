package com.company;


import com.company.linkedlist.DetectACycle;
import com.company.linkedlist.LinkedList;
import com.company.linkedlist.Node;
import com.company.linkedlist.sortedInsert;

public class Main {

    public static void main(String[] args) {
	// write your code
        LinkedList list = new LinkedList(new Node(3));
        list.insert(new Node(8));
        list.insert(new Node(10));
        list.insert(new Node(15));
        list.insert(new Node(18));
        list.print();
        sortedInsert si = new sortedInsert(new Node(16));
        si.insert(new Node(17));
        list.print();
        list.delete(69);
        list.print();
        list.insertAtMiddleSlowFastMethod(85);
        list.print();
        list.InsertAtMiddle(6);
        list.print();
        list.deleteAtMiddleSlowFastMethod(list.head);
        list.print();
       /* list.ReverseLinkedList(list.head);
        list.print();*/


    }
}
