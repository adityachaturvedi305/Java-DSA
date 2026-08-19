package Loops;

public class EvenOddNumbers {
    public static void main(String[] args){
        // even numbers
        for (int i = 1; i <= 100; i++){
            if(i%2==0) System.out.print(i+" ");
        }
        // Odd numbers
        System.out.println();
        for(int i = 1; i <= 100; i += 2){
            System.out.print(i+" ");
        }
    }
}
