package Backtracking;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.') continue;
                char num = board[row][col];
                board[row][col] = '.';
                if(!isValid(board, row, col,num)) return false;
                board[row][col] = num;
            }
        }
        return true;
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
