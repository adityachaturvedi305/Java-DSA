package BinaryTrees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){this.val = val;}
}
public class Implementation {
    static int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
    static int findMax(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        if(root.right == null && root.left == null) return root.val;
        return Math.max(root.val , Math.max(findMax(root.right), findMax(root.left)));
    }
    static int findMin(Node root) {
        if(root == null) return Integer.MAX_VALUE;
        if(root.right == null && root.left == null) return root.val;
        return Math.min(root.val , Math.min(findMin(root.right), findMin(root.left)));
    }
    static int product(Node root){
        if(root == null) return 1;
        if(root.val == 0) return 1;
        return root.val * product(root.right) * product(root.left);
    }
    static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.right) + sum(root.left);
    }
    static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.right) + size(root.left);
    }
    static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(0);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(levels(a));
    }
}
