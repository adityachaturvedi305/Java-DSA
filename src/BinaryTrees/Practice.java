package BinaryTrees;
import java.util.ArrayList;
public class Practice {
    int countNodes(Node root){
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }
    int height(Node root){
        int level = levels(root);
        return level - 1;
    }
    int countLeafNodes(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
    boolean search(Node root,int k){
        if(root == null) return false;
        if(root.val == k) return true;
        return search(root.left, k) || search(root.right, k);
    }
    int countNonLeaf(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + countNonLeaf(root.left) + countNonLeaf(root.right);
    }
    int onlyOneChild(Node root){
        if(root == null) return 0;
        int c = 0;
        if((root.left == null && root.right != null) || (root.left != null && root.right == null)) c = 1;
        return c + onlyOneChild(root.left) + onlyOneChild(root.right);
    }
    boolean isIdentical(Node p,Node q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isIdentical(p.left,q.left) && isIdentical(p.right,q.right);
    }
    boolean isSymmetrical(Node root){
        if(root == null) return true;
        return mirror(root.left, root.right);
    }
    boolean mirror(Node p, Node q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return mirror(p.left,q.right) && mirror(p.right, q.left);
    }
    Node invertTreeM1(Node root){
        invert(root);
        return root;
    }
    void invert(Node root){
        if(root == null) return;
        invert(root.left);
        invert(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    Node invertTreeM2(Node root){
        if(root == null) return null;
        Node left = invertTreeM2(root.left);
        Node right = invertTreeM2(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    int countAtLevelK(Node root, int k){
        if(root == null) return 0;
        if(k == 0) return 1;
        return countAtLevelK(root.left , k-1) + countAtLevelK(root.right, k-1);
    }
    void printLeafs(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        if(root.left == null && root.right == null) ans.add(root.val);
        printLeafs(root.left, ans);
        printLeafs(root.right, ans);
    }
    void oneChildNodes(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        if((root.left == null && root.right != null) || (root.left != null && root.right == null)) ans.add(root.val);
        oneChildNodes(root.left, ans);
        oneChildNodes(root.right, ans);
    }
    int maxValue(Node root){
        if(root == null) return Integer.MIN_VALUE;
        if(root.left == null && root.right == null) return root.val;
        return Math.max(root.val,Math.max(maxValue(root.left), maxValue(root.right)));
    }
    int minValue(Node root){
        if(root == null) return Integer.MAX_VALUE;
        if(root.left == null && root.right == null) return root.val;
        return Math.min(root.val,Math.min(minValue(root.left), minValue(root.right)));
    }
    boolean isLeafValue(Node root, int x){
        if(root == null) return false;
        if(root.left == null && root.right == null) return root.val == x;
        return isLeafValue(root.left, x) || isLeafValue(root.right, x);
    }
    int countTwoChildren(Node root){
        if(root == null) return 0;
        int c = 0;
        if(root.left != null && root.right != null) c = 1;
        return c + countTwoChildren(root.left) + countTwoChildren(root.right);
    }
    int countGreater(Node root, int x){
        if(root == null) return 0;
        int c = 0;
        if(root.val > x) c++;
        return c + countGreater(root.left, x) + countGreater(root.right, x);
    }
    int sumLeafNodes(Node root){
        if(root == null) return 0;
        int sum = 0;
        if(root.left == null && root.right == null) sum += root.val;
        return sum + sumLeafNodes(root.left) + sumLeafNodes(root.right);
    }
    int sumOneChildNodes(Node root){
        if(root == null) return 0;
        int sum = 0;
        if((root.left == null && root.right != null) || (root.left != null && root.right == null)) sum += root.val;
        return sum + sumOneChildNodes(root.left) + sumOneChildNodes(root.right);
    }
    int deepestLeafLevel(Node root){
        return leafLevel(root, 0);
    }
    int leafLevel(Node root, int level){
        if(root == null) return -1;
        if(root.left == null && root.right == null) return level;
        return Math.max(leafLevel(root.left, level + 1), leafLevel(root.right, level + 1));
    }
    void printLevelK(Node root, int k, ArrayList<Integer> ans){
        if(root == null) return;
        if(k == 0) ans.add(root.val);
        printLevelK(root.left, k-1, ans);
        printLevelK(root.right, k-1, ans);
    }
    boolean hasLeaf(Node root){
        if(root == null) return false;
        if(root.left == null && root.right == null) return true;
        return hasLeaf(root.left) || hasLeaf(root.right);
    }
    int sumAtLevelK(Node root, int k){
        if(root == null) return 0;
        int sum = 0;
        if(k == 0) sum += root.val;
        return sum + sumAtLevelK(root.left, k-1) + sumAtLevelK(root.right, k-1);
    }
    boolean allSame(Node root){
        if(root == null) return true;
        return check(root, root.val);
    }
    boolean check(Node root, int val){
        if(root == null) return true;
        if(root.val != val) return false;
        return check(root.left, val) && check(root.right, val);
    }
    int countEven(Node root){
        if(root == null) return 0;
        int c = 0;
        if(root.val % 2 == 0) c++;
        return c + countEven(root.left) + countEven(root.right);
    }
    int sumEven(Node root){
        if(root == null) return 0;
        int sum = 0;
        if(root.val % 2 == 0) sum += root.val;
        return sum + sumEven(root.left) + sumEven(root.right);
    }
    int countOdd(Node root){
        if(root == null) return 0;
        int c = 0;
        if(root.val % 2 != 0) c++;
        return c + countOdd(root.left) + countOdd(root.right);
    }
    int sumOdd(Node root){
        if(root == null) return 0;
        int sum = 0;
        if(root.val % 2 != 0) sum += root.val;
        return sum + sumOdd(root.left) + sumOdd(root.right);
    }
    boolean hasEven(Node root){
        if(root == null) return false;
        if(root.val % 2 == 0) return true;
        return hasEven(root.left) || hasEven(root.right);
    }
    boolean allEven(Node root){
        if(root == null) return true;
        if(root.val % 2 != 0) return false;
        return allEven(root.left) && allEven(root.right);
    }
    int countInternal(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        return 1 + countInternal(root.left) + countInternal(root.right);
    }
    int countLess(Node root, int x){
        if(root == null) return 0;
        int c = 0;
        if(root.val < x) c++;
        return c + countLess(root.left, x) + countLess(root.right, x);
    }
    boolean existsAtLevelK(Node root, int k, int x){
        if(root == null) return false;
        if(k == 0) return root.val == x;
        return existsAtLevelK(root.left, k-1, x) || existsAtLevelK(root.right, k-1, x);
    }
    int largestLeaf(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int max = 0;
        if(root.left == null && root.right == null) max = root.val;
        return Math.max(max, Math.max(largestLeaf(root.left), largestLeaf(root.right)));
    }
    int smallestLeaf(Node root){
        if(root == null) return Integer.MAX_VALUE;
        if(root.left == null && root.right == null) return root.val;
        return Math.min(smallestLeaf(root.left), smallestLeaf(root.right));
    }
    int countLeafAtLevelK(Node root, int k){
        if(root == null) return 0;
        int c = 0;
        if(k == 0) if(root.left == null && root.right == null) c++;
        return c + countLeafAtLevelK(root.left, k-1) + countLeafAtLevelK(root.right, k-1);
    }
    int sumLeafAtLevelK(Node root, int k){
        if(root == null) return 0;
        int sum = 0;
        if(k == 0) if(root.left == null && root.right == null) sum += root.val;
        return sum + sumLeafAtLevelK(root.left, k-1) + sumLeafAtLevelK(root.right, k-1);
    }
    int levelOf(Node root, int x){
        if(root == null) return -1;
        return currentLevel(root, x, 0);
    }
    int currentLevel(Node root, int x, int level){
        if(root == null) return -1;
        if(root.val == x) return level;
        int left = currentLevel(root.left, x, level + 1);
        if(left != -1) return left;
        return currentLevel(root.right, x, level + 1);
    }
    int countValue(Node root, int x){
        if(root == null) return 0;
        int c = 0;
        if(root.val == x) c++;
        return c + countValue(root.left, x) + countValue(root.right, x);
    }
    int sumValue(Node root, int x){
        if(root == null) return 0;
        int sum = 0;
        if(root.val == x) sum += root.val;
        return sum + sumValue(root.left, x) + sumValue(root.right, x);
    }
    int countGreaterThanParent(Node root){
        if(root == null) return 0;
        return greaterThanParent(root.left, root.val) + greaterThanParent(root.right, root.val);
    }
    int greaterThanParent(Node root, int parentVal){
        if(root == null) return 0;
        int c = 0;
        if(root.val > parentVal) c++;
        return c + greaterThanParent(root.left,root.val) + greaterThanParent(root.right, root.val);
    }
    int countSmallerThanParent(Node root){
        if(root == null) return 0;
        return smallerThanParent(root.left, root.val) + smallerThanParent(root.right,root.val);
    }
    int smallerThanParent(Node root, int parentVal){
        if(root == null) return 0;
        int c = 0;
        if(root.val < parentVal) c++;
        return c + smallerThanParent(root.left,root.val) + smallerThanParent(root.right, root.val);
    }
    int sumGreaterThanParent(Node root){
        if(root == null) return 0;
        return sumGreaterThan(root.left, root.val) + sumGreaterThan(root.right, root.val);
    }
    int sumGreaterThan(Node root, int parentVal){
        if(root == null) return 0;
        int sum = 0;
        if(root.val > parentVal) sum += root.val;
        return sum + sumGreaterThan(root.left,root.val) + sumGreaterThan(root.right, root.val);
    }
    boolean allChildrenGreater(Node root){
        if(root == null) return true;
        return allGreater(root.left,root.val) && allGreater(root.right, root.val);
    }
    boolean allGreater(Node root, int parentVal){
        if(root == null) return true;
        if(root.val <= parentVal) return false;
        return allGreater(root.left, root.val) && allGreater(root.right, root.val);
    }
    boolean allChildrenSmaller(Node root){
        if(root == null) return true;
        return allSmaller(root.left,root.val) && allSmaller(root.right, root.val);
    }
    boolean allSmaller(Node root, int parentVal){
        if(root == null) return true;
        if(root.val >= parentVal) return false;
        return allSmaller(root.left,root.val) && allSmaller(root.right, root.val);
    }
    int countEqualToParent(Node root){
        if(root == null) return 0;
        return equalToParent(root.right, root.val) + equalToParent(root.left, root.val);
    }
    int equalToParent(Node root, int parentVal){
        if(root == null) return 0;
        int c = 0;
        if(root.val == parentVal) c++;
        return c + equalToParent(root.right, root.val) + equalToParent(root.left, root.val);
    }
    int sumEqualToParent(Node root){
        if(root == null) return 0;
        return sumEqual(root.right, root.val) + sumEqual(root.left, root.val);
    }
    int sumEqual(Node root, int parentVal){
        if(root == null) return 0;
        int sum = 0;
        if(root.val == parentVal) sum += root.val;
        return sum + sumEqual(root.right, root.val) + sumEqual(root.left, root.val);
    }
    boolean hasEqualToParent(Node root){
        if(root == null) return false;
        return hasEqual(root.left,root.val) || hasEqual(root.right,root.val);
    }
    boolean hasEqual(Node root, int parentVal){
        if(root == null) return false;
        if(root.val == parentVal) return true;
        return hasEqual(root.left,root.val) || hasEqual(root.right,root.val);
    }
    boolean allEqualToParent(Node root){
        if(root == null) return true;
        return hasEqual(root.left,root.val) && hasEqual(root.right,root.val);
    }
    boolean allEqual(Node root, int parentVal){
        if(root == null) return true;
        if(root.val != parentVal) return false;
        return hasEqual(root.left,root.val) && hasEqual(root.right,root.val);
    }

    public static void main(String[] args) {

    }
}
