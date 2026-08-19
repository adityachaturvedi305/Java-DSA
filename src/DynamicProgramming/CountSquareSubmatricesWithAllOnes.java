package DynamicProgramming;

public class CountSquareSubmatricesWithAllOnes {
    public int countSquares(int[][] arr) {
        int row = arr.length, col = arr[0].length, count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(i != 0 && j != 0) {
                    if (arr[i][j] == 1) {
                        arr[i][j] += Math.min(arr[i - 1][j], Math.min(arr[i - 1][j - 1], arr[i][j - 1]));
                    }
                }
                count += arr[i][j];
            }
        }
        return count;
    }
}
