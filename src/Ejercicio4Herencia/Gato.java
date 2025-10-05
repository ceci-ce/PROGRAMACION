package Ejercicio4Herencia;

public class Gato extends Animal{

    public Gato(String nombre){
        super(nombre); //Envía parámetros al constructor de la clase padre.
    }

    @Override
    public void hacerSonido(){
        System.out.println(nombre + " hace miau!");
    }
}
