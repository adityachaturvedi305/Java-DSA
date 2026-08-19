package basics;

public class CharDataType {
    public static void main(String[] args){
        char aditya = '%';
        System.out.println(aditya);
        /* ASCII Value :-
                a = 97 to z = 122
                A = 65 to Z = 90
                0 = 48 to 9 = 57 */
        // typecasting --> ek data type se dusra data type conversion
        char ch = 'A';
        int x = ch; // implicit typecasting
        System.out.println(x);
        char Aditya = 'a';
        int y = (int)Aditya; // explicit typecasting
        System.out.println(y);
        char raghav = '3';
        System.out.println((int)raghav);
        // int to characters
        char aditya1 = 'b';
        System.out.println(aditya1);
        char aditya2 = 'b';
        System.out.println(aditya2+0);
        int c = 43;
        char aditya3 = (char)c;
        System.out.println(aditya3);



    }
}
