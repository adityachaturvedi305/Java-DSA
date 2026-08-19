package IfElse;

import java.util.Scanner;

public class CheckValidDate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt(),month = sc.nextInt(),year = sc.nextInt();
        boolean isValid = true;

        // Year check
        if (year < 1000 || year > 9999) {
            isValid = false;
        }

        // Month check
        else if (month < 1 || month > 12) {
            isValid = false;
        }

        // Day check
        else {
            int maxDays;

            if (month == 2) {
                // Leap year check
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                    maxDays = 29;
                else
                    maxDays = 28;
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxDays = 30;
            }
            else {
                maxDays = 31;
            }

            if (day < 1 || day > maxDays) {
                isValid = false;
            }
        }

        if (isValid)
            System.out.println("Valid date format");
        else
            System.out.println("Invalid date format");
    }
}
