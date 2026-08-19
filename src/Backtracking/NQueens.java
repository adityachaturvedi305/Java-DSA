package Backtracking;
import java.util.ArrayList;
import java.util.List;
public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] chessBord = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                chessBord[i][j] = '.';
            }
        }
        nQueens(0 ,chessBord, ans);
        return ans;
    }

    public void nQueens(int row, char[][] chessBord, List<List<String>> ans) {
        int n = chessBord.length;
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(int i = 0; i < n; i++) temp.add(new String(chessBord[i]));
            ans.add(temp);
            return;
        }
        for(int col = 0; col < n; col++){
            if(isSafe(row, col, chessBord)){
                chessBord[row][col] = 'Q';
                nQueens(row + 1, chessBord, ans);
                chessBord[row][col] = '.';
            }
            else chessBord[row][col] = '.';
        }
    }

    public boolean isSafe(int row, int col, char[][] chessBoard) {
        // check column
        for(int i = row-1 ; i >= 0; i--) if(chessBoard[i][col] == 'Q') return false;
        // check left diagonal
        int i = row-1, j = col-1;
        while (i >= 0 && j >= 0){
            if(chessBoard[i][j] == 'Q') return false;
            i--; j--;
        }
        // check right diagonal
        i = row-1; j = col+1;
        while (i >= 0 && j < chessBoard.length){
            if(chessBoard[i][j] == 'Q') return false;
            i--; j++;
        }
        return true;
    }
}
