package basics.PracticeForCodethon.MayankSirQues;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("Addition = " + (a + b));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    int c = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int d = sc.nextInt();
                    System.out.println("Subtraction = " + (c - d));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int p = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int q = sc.nextInt();
                    System.out.println("Multiplication = " + (p * q));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    double x = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double y = sc.nextDouble();
                    if (y != 0)
                        System.out.println("Division = " + (x / y));
                    else
                        System.out.println("Division by zero not allowed");
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    int g = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int f = sc.nextInt();
                    System.out.println("Modulus = " + (g % f));
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
        sc.close();
    }
}
