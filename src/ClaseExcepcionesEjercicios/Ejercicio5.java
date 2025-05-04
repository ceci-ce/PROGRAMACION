// Ejercicio 5: Longitud de un nombre
//
//Objetivo: Añadir manejo de NullPointerException

//Instrucción: Usa try-catch para evitar que el programa se detenga si nombre es null.

package ClaseExcepcionesEjercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String nombre = null;

        try{
            System.out.println("La longitud del nombre es: " + nombre.length());
        }catch (NullPointerException e){
            System.out.println("Error: El nombre es null.No se puede calcular la longitud");
        }
    }
}
