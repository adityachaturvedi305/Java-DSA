package DynamicProgramming;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class DiameterOfBinaryTree {
//    static int max;
//    public int diameterOfBinaryTree(TreeNode root) {
//        max = 0;
//        levels(root);
//        return max;
//    }
//    public int levels(TreeNode root){
//        if(root == null) return 0;
//        int leftlevels = levels(root.left);
//        int rightlevels = levels(root.right);
//        max = Math.max(max, leftlevels + rightlevels);
//        return 1 + Math.max(leftlevels, rightlevels);
//    }

//    static Map<TreeNode, Integer> dp;
//    public int diameterOfBinaryTree(TreeNode root) {
//        dp = new HashMap<>();
//        return diameter(root);
//    }
//
//    public int diameter(TreeNode root) {
//        if(root == null) return 0;
//        int myDia = levels(root.left) + levels(root.right);
//        int leftDia = diameter(root.left);
//        int rightDia = diameter(root.right);
//        return Math.max(myDia,Math.max(leftDia, rightDia));
//    }
//
//    public int levels(TreeNode root){
//        if(root == null) return 0;
//        if(dp.containsKey(root)) return dp.get(root);
//        int leftLevels = levels(root.left);
//        int rightLevels = levels(root.right);
//        dp.put(root, 1 + Math.max(leftLevels, rightLevels));
//        return 1 + Math.max(leftLevels, rightLevels);
//    }
}
