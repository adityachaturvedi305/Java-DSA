package Arrays1D;
import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        int newsize = n;
        for(int i=0; i<newsize; i++){
            for(int j=i+1; j<newsize; j++){
                if(arr[i]==arr[j]){
                    for(int k=j; k<newsize-1; k++) arr[k]=arr[k+1];
                    newsize--;
                    j--;
                }
            }
        }
        System.out.print("Array after removing duplicate element : ");
        for(int i=0; i<newsize; i++) System.out.print(arr[i]+" ");
    }
}
