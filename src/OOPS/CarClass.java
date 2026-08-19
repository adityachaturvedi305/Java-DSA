package OOPS;

import java.util.Scanner;

class Car{
    String brand;
    double price;
    Car(String brand, double price){
        this.brand = brand;
        this.price = price;
    }
    void show(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
public class CarClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brand name: ");
        String brand = sc.next();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        Car c = new Car(brand,price);
        c.show();
    }
}
