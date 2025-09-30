package Ejercicio1Herencia;

public class Bicicleta extends Vehiculo{
    private int numeroMarchas;

    public Bicicleta(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    @Override
    public double calcularVelocidadMaxima(){
        return this.numeroMarchas * 5.0;
    }

    @Override
    public double consumo(){
        return numeroMarchas * 10.0;
    }
}
