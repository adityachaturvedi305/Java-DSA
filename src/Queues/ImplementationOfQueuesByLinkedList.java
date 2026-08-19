package Queues;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyQueue{
    Node head;
    Node tail;
    int length;
    void add(int val){
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        length++;
    }
    int peek(){
        if(length == 0){
            System.out.println("Queue is Empty");
            return-1;
        }
        return head.val;
    }
    int remove(){
        if(length == 0){
            System.out.println("Queue is Empty");
            return-1;
        }
        int front = head.val;
        head = head.next;
        length--;
        return front;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int size(){
        return length;
    }
}
public class ImplementationOfQueuesByLinkedList {
    public static void main(String[] args) {
         MyQueue q = new MyQueue();

    }
}
