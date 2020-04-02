package com.company.linkedlist;

public class sortedInsert {
    public Node head;
    public sortedInsert(Node head){
        this.head = head;
    }

    public Node getHead(){
        return head;
    }

    public void insert(Node new_node){
        Node current;
        if(head == null || head.data >= new_node.data){
            new_node.next = head;
            head = new_node;
        }
        else {
            current = head;
            while(current.next != null && current.next.data <new_node.data){
                current = current.next;

                new_node.next = current.next;
                current.next = new_node;
            }
        }
    }
}
