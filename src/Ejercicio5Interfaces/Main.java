package Ejercicio5Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Reproducible> reproducibles = new ArrayList<>();
        reproducibles.add(new Cancion());
        reproducibles.add(new Video());

        for(Reproducible r: reproducibles){
            r.reproducir();
        }
    }
}
