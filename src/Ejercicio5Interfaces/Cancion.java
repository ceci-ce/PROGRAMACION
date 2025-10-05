package Ejercicio5Interfaces;

public class Cancion implements Reproducible{

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo cancion...");
    }
}
