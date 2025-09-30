import Ejercicio1Herencia.Bicicleta;
import Ejercicio1Herencia.Coche;
import Ejercicio1Herencia.Vehiculo;

public class Main {
    public static void main(String[] args){

        Vehiculo [] vehiculos  = {new Coche(120),new Bicicleta(18)}; //se crea el vector

        for (Vehiculo v : vehiculos){
            // el instanceof es una forma de distinguir si estoy recorriendo un objeto de tipo coche o bici
            if (v instanceof Coche c){
                System.out.println("Velocidad máxima: " + c.calcularVelocidadMaxima() + "km/h");
                System.out.println("Consumo: " + c.consumo() + "l/km");
            } else if (v instanceof Bicicleta b) {
                System.out.println("Velocidad máxima: " + b.calcularVelocidadMaxima() + "km/h");
                System.out.println("Calorias: " + b.consumo() + "cal");
            }
        }

    }
}