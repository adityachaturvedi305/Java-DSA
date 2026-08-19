package basics.PracticeForCodethon.MayankSirQues;

import java.util.Scanner;

public class ElectricityBillGenerator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units : ");
        int units = sc.nextInt();
        int charges , bill ;
        int fixedMeter = 150;
        if (units <= 100) charges = units * 2;
        else if (units <= 200) charges = (100 * 2) + (units - 100) * 3;
        else charges = (100 * 2) + (100 * 3) + (units - 200) * 5;
        bill = charges+fixedMeter;
        System.out.println(bill);
        sc.close();
    }
}
