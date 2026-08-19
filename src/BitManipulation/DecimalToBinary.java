package BitManipulation;

import java.util.Scanner;
import static Strings.ReverseString.reverse;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double n = sc.nextDouble();

        int intPart = (int) n;
        double fracPart = n - intPart;
        // Integer part
        String intBin = "";
        if (intPart == 0) intBin = "0";
        else {
            while (intPart > 0) {
                intBin = (intPart % 2) + intBin;
                intPart /= 2;
            }
        }
        // Fractional part
        String fracBin = "";
        while (fracPart > 0 && fracBin.length() < 10) { // 10 bits precision
            fracPart *= 2;
            if (fracPart >= 1) {
                fracBin += "1";
                fracPart -= 1;
            } else {
                fracBin += "0";
            }
        }
        System.out.println("Binary: " + intBin + "." + fracBin);
        sc.close();
    }
}
