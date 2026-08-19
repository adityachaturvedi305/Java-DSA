package Arrays1D;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {0,1 , 1 ,0, 2 , 2, 2, 0};
        sortColors(arr);
    }

    public static void sortColors(int[] arr) {
        int zero = 0, one = 0, two = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) zero++;
            else if(arr[i] == 1) one++;
            else two++;
        }

        int j = 0;
        while(zero > 0){
            arr[j] = 0;
            zero--;
            j++;
        }
        while(one > 0){
            arr[j] = 1;
            one--;
            j++;
        }
        while(two > 0){
            arr[j] = 2;
            two--;
            j++;
        }
    }
}
