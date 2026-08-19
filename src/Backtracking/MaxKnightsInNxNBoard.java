package Backtracking;

public class MaxKnightsInNxNBoard {
    static int max;
    static int k;
    public static void main(String[] args) {
        int n = 3;
        max = -1;
        k = 5;
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'x';
            }
        }
        fillBoard(board, 0, 0, 0);
        System.out.println(max);
    }
    public static void fillBoard(char[][] board, int row, int col, int num){
        int n = board.length;
        if(n == row){
//            if(num == k){
//                for(int i = 0; i < n; i++){
//                    for(int j = 0; j < n; j++){
//                        System.out.print(board[i][j]+" ");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
            max = Math.max(max, num);
            return;
        }
        if(isSafe(board, row, col)){
            board[row][col] = 'K';
            if(col < n-1) fillBoard(board, row, col+1, num+1);
            else fillBoard(board, row+1, 0, num+1);
            board[row][col] = 'x';
        }
        if(col < n-1) fillBoard(board, row, col+1, num);
        else fillBoard(board, row+1, 0, num);
    }
    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        int i,j;
        // 2 Up 1 right
        i = row - 2;
        j= col + 1;
        if(i>=0 && j<n && board[i][j] == 'K') return false;
        // 2 Up 1 left
        i = row - 2;
        j=col -1;
        if(i>=0 && j>=0 && board[i][j] == 'K') return false;
        // 2 Down 1 right
        i = row + 2;
        j= col + 1;
        if(i<n && j<n && board[i][j] == 'K') return false;
        // 2 Down 1 left
        i = row + 2;
        j= col -1;
        if(i<n && j>=0 && board[i][j] == 'K') return false;
        // 2 Right 1 Up
        i= row - 1;
        j= col + 2;
        if(i>=0 && j<n && board[i][j] == 'K') return false;
        // 2 Right 1 Down
        i = row + 1;
        j= col + 2;
        if(i<n && j<n && board[i][j] == 'K') return false;
        // 2 Left 1 Up
        i= row - 1;
        j= col -2;
        if(i>=0 && j>=0 && board[i][j] == 'K') return false;
        // 2 Left 1 Down
        i = row + 1;
        j= col -2;
        if(i<n && j>=0 && board[i][j] == 'K') return false;
        return true;
    }
}
