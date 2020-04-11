package com.company.linkedlist;

public class DetectACycle {
    public Node head;
    public DetectACycle(Node head){
        this.head = head;
    }

    public Node getHead(){
        return head;
    }

    public void detectACycleWithSlowFastMethod(Node node){

        if(node == null || node.next == null){
            return;
        }
        Node slow = node, fast = node;

        slow = slow.next;
        fast = fast.next.next;

        while (fast!=null && fast.next!=null){
            if(slow == fast){
                break;
            }
            slow = slow.next;
            fast = fast.next;
        }

        //If loop exists, we should remove that
        if(slow == fast){
            slow = node;
            while(slow.next != fast.next){
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }
}
