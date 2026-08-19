package Arrays2D;
import java.util.Scanner;
public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int m = sc.nextInt();
        System.out.print("Enter column: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) arr[i][j] = sc.nextInt();
        }
        boolean ok = true;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == j && arr[i][j] != 1) ok = false;
                if(i != j && arr[i][j] != 0) ok = false;
            }
        }
        if(ok) System.out.println("Identity Matrix");
        else System.out.println("Not Identity Matrix");
    }
}
