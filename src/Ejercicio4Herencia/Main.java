package Ejercicio4Herencia;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Perro("Perro");
        Animal animal2 = new Gato("Gato");

        Animal[] animales = {animal1, animal2};

        for(Animal a: animales){
            a.hacerSonido();
        }
    }
}
