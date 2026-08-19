package BinaryTrees;
public class PreInPostOrder {
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
        preOrder(a);
        System.out.println();
        inOrder(a);
        System.out.println();
        postOrder(a);
    }
    static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root) {
        if(root == null) return;
        preOrder(root.left);
        System.out.print(root.val+" ");
        preOrder(root.right);
    }
    static void postOrder(Node root) {
        if(root == null) return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val+" ");
    }
}
