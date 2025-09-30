package Ejercicio1Herencia;

public class Coche extends Vehiculo{
    private int caballos;

    // se declara el constructor
    public Coche(){

    }
    public Coche(int caballos){
        this.caballos = caballos;
    }

    @Override
    public double calcularVelocidadMaxima(){
        return this.caballos * 2.0;
    }

    @Override
    public double consumo(){
        return caballos * 0.05;
    }
}
