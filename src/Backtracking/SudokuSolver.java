package Backtracking;

public class SudokuSolver {
    static boolean check;
    public void solveSudoku(char[][] arr) {
        check = true;
        solve(arr, 0, 0);
    }

    public void solve(char[][] board, int row, int col) {
        if(row == 9){
            check = false;
            return;
        }
        if(board[row][col] != '.'){
            if(col != 8) solve(board, row, col+1);
            else solve(board,row+1, 0);
        }
        else{
            for(char i = '1'; i <= '9'; i++){
                if(isValid(board, row, col,i)){
                    board[row][col] = i;
                    if(col != 8) solve(board, row, col+1);
                    else solve(board,row+1, 0);
                    if(check) board[row][col] = '.';
                }
            }
        }
    }

    public boolean isValid(char[][] board, int row , int col, int num){
        for(int i = 0; i < 9; i++) if(board[i][col] == num) return false;
        for(int j = 0; j < 9; j++) if(board[row][j] == num) return false;
        int i = row/3 * 3, j = col/3 * 3;
        for(int r = i; r < i+3; r++){
            for(int c = j; c < j+3; c++){
                if(board[r][c] == num) return false;
            }
        }
        return true;
    }
}
