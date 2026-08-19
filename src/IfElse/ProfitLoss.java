package IfElse;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cp : ");
        double cp = sc.nextDouble();
        System.out.print("Enter sp : ");
        double sp = sc.nextDouble();
        double profit_percentage = ((sp-cp)/cp)*100;
        double loss_percentage = ((cp-sp)/cp)*100;
        if (sp > cp ) System.out.println("Profit "+ profit_percentage+"%");
        else if (cp > sp) System.out.println("Loss "+ loss_percentage+"%");
        else System.out.println("No profit or No loss");
    }
}
