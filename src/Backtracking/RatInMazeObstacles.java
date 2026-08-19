package Backtracking;
import java.util.ArrayList;
import java.util.Collections;

public class RatInMazeObstacles {
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        paths(0,0,n-1,n-1, visited,"", ans, maze);
        Collections.sort(ans);
        return ans;
    }
    private static void paths(int r, int c, int er, int ec, boolean[][] visited, String s, ArrayList<String> ans, int[][] maze) {
        if (r > er || c > ec || r < 0 || c < 0 || maze[r][c] == 0 || visited[r][c]) return;
        visited[r][c] = true;
        if (r == er && c == ec){
            ans.add(s);
            visited[r][c] = false;
            return ; // valid path
        }
        paths(r, c - 1, er, ec, visited, s + 'L', ans, maze);
        paths(r - 1, c, er, ec, visited, s + 'U', ans, maze);
        paths(r, c + 1, er, ec, visited, s + 'R', ans, maze);
        paths(r + 1, c, er, ec, visited, s + 'D', ans, maze);
        visited[r][c] = false;
    }
}
