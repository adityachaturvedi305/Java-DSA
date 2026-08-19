package LinkedList;
class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;

    void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayRev(ListNode head){
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAtIdx(int idx, int val){
        if(idx<0 || idx>size){
            System.out.println("Invalid idx");
            return;
        }
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size){
            insertAtTail(val);
            return;
        }
        ListNode a = new ListNode(val);
        ListNode temp = head;
        for(int i=0; i<idx-1; i++) temp = temp.next;
        a.prev = temp;
        a.next = temp.next;
        temp.next = a;
        a.next.prev = a;
        size++;
    }
    void deleteAtHead(){
        if(head == null){
            System.out.println("Cannot delete because list is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtTail(){
        if(tail == null){
            System.out.println("Cannot delete because list is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void deleteAtIdx(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid index!");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx == size-1){
            deleteAtTail();
            return;
        }
        ListNode temp = head;
        for(int i=0; i<idx-1; i++) temp = temp.next;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }

}
public class DoublyLinkedListClass {
    public static void main(String[] args) {
        DLL list = new DLL();
    }
}
