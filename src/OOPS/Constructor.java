package OOPS;

public class Constructor {
    public static class Car{
        int price; // 0
        String name; // null
        Car(){ // default constructor

        }
        Car(int price,String name){
            this.price = price;
            this.name = name;
        }
        Car(String c,int p){
            price = p;
            name = c;
        }
        void print(){
            int price = 23;
            System.out.println(this.price +" "+name);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(12500000,"Kia Sonet");
        c1.print();
        Car c2 = new Car("Honda city",600000);
        c2.print();
        Car c3 = new Car();
        c3.name = "BMW";
    }
}
