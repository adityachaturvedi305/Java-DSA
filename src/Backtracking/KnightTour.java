package Backtracking;

public class KnightTour {
    public boolean checkValidGrid(int[][] grid) {
        return isValid(0, 0, 0, grid);
    }
    public boolean isValid(int num, int row, int col, int[][] arr) {
        int n = arr.length;
        if (row < 0 || col < 0 || row >= n || col >= n) return false;
        if (arr[row][col] != num) return false;
        if (num == n * n - 1) return true;
        return isValid(num + 1, row - 2, col - 1, arr) ||
                isValid(num + 1, row - 2, col + 1, arr) ||
                isValid(num + 1, row - 1, col + 2, arr) ||
                isValid(num + 1, row + 1, col + 2, arr) ||
                isValid(num + 1, row + 2, col - 1, arr) ||
                isValid(num + 1, row + 2, col + 1, arr) ||
                isValid(num + 1, row - 1, col - 2, arr) ||
                isValid(num + 1, row + 1, col - 2, arr);
    }
}
