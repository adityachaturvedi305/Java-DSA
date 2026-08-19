package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // single BFS Lagana hai 0 pe
        int n = rooms.size();
        boolean[] isVisited = new boolean[n];
        isVisited[0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()){
            int front = q.remove();
            for(int ele : rooms.get(front)){
                if(!isVisited[ele]){
                    q.add(ele);
                    isVisited[ele] = true;
                }
            }
        }

        for(boolean flag : isVisited) if(!flag) return false;
        return true;
    }
}
