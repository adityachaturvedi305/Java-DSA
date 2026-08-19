package OOPS;

public class PassingClassesToMethods {
    public static class car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(seats+" "+name+" "+length+" "+type+" "+torque);
        }
    }
    public static void main(String[] args) {
        car c = new car();
        c.seats = 5;
        c.name = "Kia Sonet";
        c.length = 3.99;
        c.type = "SUV";
        c.torque = 178;

        change(c);

        System.out.println(c.seats);

        c.print();
    }

    private static void change(car x) {
        x.seats = 4;
    }

}
