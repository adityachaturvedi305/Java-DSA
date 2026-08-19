package Loops;

public class WhileLoop {
    public static void main(String[] args){
        // for loop as while loop
        int j = 1;
        for(;j <= 10;){
            System.out.print(j+" ");
            j++;
        }
        System.out.println();
        // While loop
        /*
        generally used when conditions are more than one or
        jab bhi iterations nahi pata ho
         */
        int i = 1;
        while (i <= 10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        // do-while loop
        int k = 1;
        do { // it will run at least one time even if the condition is false
            System.out.print(k+" ");
            k++;
        }while (k <= 10);
    }
}
