package basics;

public class ModulusOperator {
    public static void main(String[] args){
        // a % b is the remainder when a is divided by b
        System.out.println(5%2);
        /* Properties of Modulus Operator :-
        1. a % b    --> a (if a < b)
        2. a % (-b) --> a % b
        3. (-a) % b --> -(a % b)
        Formula --> a % b --> a - b*(a/b)
        */
    }

}
