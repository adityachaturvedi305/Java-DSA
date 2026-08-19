package OOPS;
class Pokemon{
    private int power;
    String type;
    Pokemon(String type, int power){ // Act as a  getter
        this.type = type;
        this.power = power;
    }
    Pokemon(int power,String type){ // Act as a  getter
        this.type = type;
        this.power = power;
    }
    Pokemon(){

    }
    int getPower(){
        return power;
    }
    void print(){ // getter
        System.out.println(this.power+" "+this.type);
    }
}
class StrongPokemon extends Pokemon{ // child class
    String speed;
}
class legendaryPokemon extends Pokemon{ // child class
    String ability;
}
class GodPokemon extends legendaryPokemon{
    char tag;
}
public class Inheritance {
    public static void main(String[] args) {
        legendaryPokemon p1 = new legendaryPokemon();
        p1.ability = "Pressure";
        Pokemon p2 = new Pokemon();
        GodPokemon p3 = new GodPokemon();
    }
}
