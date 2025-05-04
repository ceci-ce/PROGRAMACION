//Ejercicio 3: Acceso a un array
//
//Objetivo: Añadir manejo de ArrayIndexOutOfBoundsException

//Instrucción: Usa try-catch para evitar error si se ingresa una posición incorrecta (como 5 o -1).

package ClaseExcepcionesEjercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Banana", "Naranja"};

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un número entre 0 y 2: ");
            int posicion = sc.nextInt();

            System.out.println("Fruta seleccionada: " + frutas[posicion]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Elige una posicion correcta");
        } finally {
            sc.close();
        }
    }
}
