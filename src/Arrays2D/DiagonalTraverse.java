package Arrays2D;

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] ans = new int[n * m];
        int i = 0, j = 0, c = 0;
        boolean up = true;
        while (c < n * m) {
            ans[c++] = mat[i][j];
            if(up) {
                if (j == m - 1) {
                    i++;
                    up = false;
                }
                else if (i == 0) {
                    j++;
                    up = false;
                }
                else {
                    i--;
                    j++;
                }
            }
            else {
                if (i == n - 1) {
                    j++;
                    up = true;
                }
                else if (j == 0) {
                    i++;
                    up = true;
                }
                else {
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}
