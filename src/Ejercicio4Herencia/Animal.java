package Ejercicio4Herencia;

public abstract class Animal {

    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre; // asigna el valor del parámetro al atributo
    }

    public abstract void hacerSonido(); // metodo abstracto: se implementa en los hijos
}
