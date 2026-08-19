package MapsAndSets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
class Pair{
    TreeNode node;
    int time;
    Pair(TreeNode node, int time){
        this.node = node;
        this.time = time;
    }
}
public class BurningTree {
    TreeNode st;
    HashMap<TreeNode, TreeNode> map;
    public int amountOfTime(TreeNode root, int start) {
        map = new HashMap<>();
        st = null;
        dfs(root, start);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(st, 0));
        HashSet<TreeNode> burned = new HashSet<>();
        burned.add(st);
        int maxTime = 0;
        while(!q.isEmpty()){
            Pair front = q.remove();
            int time = front.time;
            TreeNode node = front.node;
            maxTime = Math.max(maxTime, time);
            if(node.left != null && !burned.contains(node.left)){
                q.add(new Pair(node.left, time+1));
                burned.add(node);
            }
            if(node.right != null && !burned.contains(node.right)){
                q.add(new Pair(node.right, time+1));
                burned.add(node);
            }
            if(map.containsKey(node) && !burned.contains(map.get(node))){
                q.add(new Pair(map.get(node), time+1));
                burned.add(map.get(node));
            }
        }
        return maxTime;
    }
    public void dfs(TreeNode root, int start){
        if(root == null) return;
        if(root.val == start) st = root;
        if(root.left != null) map.put(root.left, root);
        if(root.right != null) map.put(root.right, root);
        dfs(root.left, start);
        dfs(root.right, start);
    }
}
