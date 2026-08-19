package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class TraversalInQueues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        display(q);
        addAtIdx(q,2,60);
    }
    public static void addAtIdx(Queue<Integer> q,int idx, int val) {
        if(idx < 0 || idx > q.size()){
            System.out.println("Invalid index!");
            return;
        }
        int n = q.size();
        if(idx < n) for(int i = 0; i < idx; i++) q.add(q.remove());
        q.add(val);
        for(int i = 0; i < n - idx; i++) q.add(q.remove());
    }
    public static void removeAtIdx(Queue<Integer> q,int idx) {
        if(idx < 0 || idx >= q.size()){
            System.out.println("Invalid index!");
            return;
        }
        int n = q.size();
        for(int i = 0; i < idx; i++) q.add(q.remove());
        q.remove();
        for(int i = 0; i < n - idx - 1; i++) q.add(q.remove());
    }
    public static int peek(Queue<Integer> q,int idx) {
        if(idx < 0 || idx >= q.size()){
            System.out.println("Invalid index!");
            return-1;
        }
        int n = q.size();
        for(int i = 0; i < idx; i++) q.add(q.remove());
        int p = q.peek();
        for(int i = 0; i < n - idx; i++) q.add(q.remove());
        return p;
    }
    public static void display(Queue<Integer> q){
        int n = q.size();
        for(int i = 0; i < n; i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
}
