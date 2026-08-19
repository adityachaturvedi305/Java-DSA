package basics.PracticeForCodethon.MayankSirQues;

import java.util.Scanner;

public class AuthenticationSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String u = "Aditya";
        String p = "Aditya@786";
        int attempts = 3;
        String username, password;
        do {
            System.out.print("Enter username: ");
            username = sc.nextLine();
            System.out.print("Enter password: ");
            password = sc.nextLine();
            if (username.equals(u) && password.equals(p)) {
                System.out.println("Successfully logged in");
                break; // exit loop after successful login
            } else {
                attempts--;
                System.out.println("Login failed. Attempts left: " + attempts);
            }
        } while (attempts > 0);
        if (attempts == 0) System.out.println("Account locked. Too many failed attempts.");
        sc.close();
    }
}
