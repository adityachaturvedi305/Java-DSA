package basics.PracticeForCodethon.MayankSirQues;

import java.util.Scanner;

public class SmartBillingSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price : ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity : ");
        int quantity = sc.nextInt();
        double bill = price * quantity;
        double discount = 0;
        double totalBill;
        if (bill <= 2000) discount = bill * 0.05;   // 5% discount
        else if (bill <= 5000) discount = bill * 0.10;   // 10% discount
        double afterDiscount = bill - discount;
        double gst = afterDiscount * 0.18;  // 18% GST
        totalBill = afterDiscount + gst;
        System.out.println("Total Bill = " + totalBill);
        sc.close();
    }
}
