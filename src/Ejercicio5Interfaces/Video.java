package Ejercicio5Interfaces;

public class Video implements Reproducible {

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo video...");
    }
}
