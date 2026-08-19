package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;
import static BinaryTrees.Implementation.levels;
class Pair {
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}
public class LevelOrderTraversal {
    static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        levelOrder(a);
        levelOrderLevelWise(a);
        kthLevel(a,0,2);
        for(int i = 0; i < levels(a); i++){ // o(n*n)
            kthLevel(a,0,2);
            System.out.println();
        }
    }
    static void kthLevel(Node root, int level, int k) {
        if(root == null) return;
        if(level == k) System.out.print(root.val+" ");
        kthLevel(root.left, level, k);
        kthLevel(root.right, level, k);
    }
    static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }
        System.out.println();
    }
    static void levelOrderLevelWise(Node root) {
        Queue<Pair> q = new LinkedList<>();
        int currentLevel = 0;
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front = q.remove();
            if(front.level != currentLevel){ // Important
                currentLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left != null) q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right != null) q.add(new Pair(front.node.right, front.level+1));
        }
        System.out.println();
    }
}
