package LinkedList;
class Node{ // user defined data type
    int val;
    Node next; // null
    Node(int val){
        this.val = val;
    }
}
class Linkedlist{ // user defined data structure
    Node head;
    Node tail;
    int size;

    void addAtHead(int val) {
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    int search(int val){
        if(head == null) return -1;
        Node temp = head;
        int idx = 0;
        while (temp != null){
            if(temp.val==val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead() {
        if(head == null) {
            System.out.println("Linked list is Empty!");
            return;
        }
        head = head.next;
        if(head == null) tail = null;
        size--;
    }
    void display() {
        if(head == null) return;
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            if(temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    int get(int idx) {
        if(size<idx || head == null) {
            System.out.println("Invalid index!");
            return -1;
        }
        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void insertAt(int val, int idx) {
        if (idx<0 || idx>size) System.out.println("Invalid index!");
        else if (idx == 0) addAtHead(val);
        else if(size == idx) addAtTail(val);
        else {
            Node temp = head;
            for (int i=0; i<idx-1; i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    void deleteAt(int idx) {
        if(idx<0 || idx >= size) {
            System.out.println("Invalid index!");
            return;
        }
        if (idx == 0) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        for (int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next; // delete
        if (idx == size-1) tail = temp; // delete at tail
        size--;
    }

}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);

        ll.display();

        ll.addAtHead(50);

        ll.deleteAtHead();

        ll.insertAt(40,2);

        ll.deleteAt(3);
    }
}
