package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces {
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] isVisited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!isVisited[i]){
                bfs(i, isVisited, adj);
                count++;
            }
        }
        return count;
    }

    private void bfs(int i, boolean[] isVisited, int[][] adj) {
        int n = adj.length;
        isVisited[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front = q.remove();
            for(int j = 0; j < n; j++){
                if(adj[front][j] == 1 && !isVisited[j]){
                    q.add(j);
                    isVisited[j] = true;
                }
            }
        }
    }
}
