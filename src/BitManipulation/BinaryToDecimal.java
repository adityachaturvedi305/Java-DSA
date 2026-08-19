package BitManipulation;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String bin = sc.next();
        String[] parts = bin.split("\\.");
        // Integer part
        double ans = 0;
        String intPart = parts[0];
        int pow = 0;
        for (int i = intPart.length() - 1; i >= 0; i--) {
            ans += (intPart.charAt(i) - '0') * Math.pow(2, pow++);
        }
        // Fractional part
        if (parts.length > 1) {
            String fracPart = parts[1];
            double frac = 0.5;
            for (int i = 0; i < fracPart.length(); i++) {
                if (fracPart.charAt(i) == '1') {
                    ans += frac;
                }
                frac /= 2;
            }
        }
        System.out.println("Decimal: " + ans);
        sc.close();
    }
}
