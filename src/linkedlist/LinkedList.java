package linkedlist;

public class LinkedList {
    Node head;
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
    public void ReverseLinkedList(Node node){
        //No need of newnode here coz we are reversing
        
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
