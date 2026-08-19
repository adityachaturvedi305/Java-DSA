package OOPS;
class ComplexNumber{
    double x;
    double y;
    ComplexNumber(){}
    ComplexNumber(double x,double y){
        this.x = x;
        this.y = y;
    }
    void print(){
        if(y>=0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }
    void add(ComplexNumber z) {
        this.x += z.x;
        this.y += z.y;
    }
    void multiply(ComplexNumber z) {
        double real = x * z.x - y * z.y;
        double imag = x * z.y + y * z.x;
        this.x = real;
        this.y = imag;
    }
    public void divide(ComplexNumber z) {
        double real = (x * z.x + y * z.y) / (z.x * z.x + z.y * z.y);
        double imag = (y * z.x - x * z.y) / (z.x * z.x + z.y * z.y);
        this.x = real;
        this.y = imag;
    }
}
public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2,5);
        ComplexNumber z2 = new ComplexNumber(3,-6);
        z1.print(); z2.print();
        z1.add(z2);
        z1.print(); z2.print();
        z1.multiply(z2);
        z1.print(); z2.print();
        z1.divide(z2);
        z1.print(); z2.print();
    }
}
