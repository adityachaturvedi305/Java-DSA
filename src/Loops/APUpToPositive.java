package Loops;

public class APUpToPositive {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        // 99,95,91,87,.. upto positive terms
//        int a = 99, d = 4;
        for (int i = 99; i >= 0  ; i -= 4) {
            System.out.print(i+" ");
//            a -= d;
        }
    }
}
