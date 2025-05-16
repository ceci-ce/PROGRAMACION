package ClaseArraysList;

import java.util.ArrayList;

public class ejercicio6b {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ceci");
        nombres.add("Ale");
        nombres.add("Bali");
        nombres.add("Bruna");
        nombres.add("Amanda");

        for(String nom: nombres){
            System.out.print(nom + " ");
        }
    }
}
