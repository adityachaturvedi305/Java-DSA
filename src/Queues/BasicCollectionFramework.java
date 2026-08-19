package Queues;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class BasicCollectionFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> t = new ArrayDeque<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        System.out.println(q+" "+q.peek());
        q.remove();
        System.out.println(q);
        System.out.println(q.remove()+" "+q);
    }
}
