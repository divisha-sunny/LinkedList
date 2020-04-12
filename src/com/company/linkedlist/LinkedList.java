package com.company.linkedlist;

public class LinkedList {
    public Node head;
    public LinkedList(Node head){
        this.head = head;
    }

    public Node getHead(){
        return head;
    }

    public void insert(Node newNode){
        Node current = head;
        while(current.next != null ){
            current = current.next;
        }
        current.next = newNode;
    }
    public void delete(int data){
        Node current = head;
        if(current.data == data){
            head = current.next;
            return;
        }
        while(current.next != null && current.next.data != data){
            current = current.next;
        }
        if(current.next == null){
            System.out.println("Element not found");
            return;
        }
        current.next = current.next.next;

    }
    public void insertAtMiddleSlowFastMethod(int data) {

        Node slow;
        Node fast;
        if(head == null){
            head = new Node(data);
        }
        else{
            Node newNode = new Node(data);
            slow = head;
            fast = head.next;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            newNode.next = slow.next;
            slow.next = newNode;
        }
    }

    public Node deleteAtMiddleSlowFastMethod(Node node){
        Node slow;
        Node fast;
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        //Here we should have a fast, slow and a previous pointer for deletion
        slow = node;
        fast = node;
        Node prev = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
        return node;
    }
    public void InsertAtMiddle(int data){
        if(head == null){
            head = new Node(data);
        }
        else{
            Node newNode = new Node(data);
            Node current = head;
            int len=0;
            while(current != null){
                len++;
                current = current.next;
            }
            int count;
            if((len%2) == 0){
                count = len/2;
            }
            else{
                count = (len+1)/2;
            }
            current = head;
            for (int i = 1; i < count; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public Node ReverseLinkedList(Node node){
        //No need of newnode here coz we are reversing
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = prev;
        }
        node = prev;
        return node;
    }


    public void print(){
        Node current = head;
        if(head != null) {
            while (current.next != null) {
                System.out.print(current.data + "->");
                current = current.next;

            }
            System.out.println(current.data);
        }

    }
}
