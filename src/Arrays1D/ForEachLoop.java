package Arrays1D;

public class ForEachLoop {
    public static void main(String[] args){
        int[] arr = {5,8,2,6,9};
        for(int element : arr){
            System.out.print(element +" ");
        }
        for(int element : arr){
            element *= 2;
        }
        System.out.println();
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}
