package BitManipulation;
import java.util.Scanner;
public class TwoPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Power: ");
        int n = sc.nextInt();
        int pow = 1 << n;
        System.out.println("Result: "+pow);
    }
}
