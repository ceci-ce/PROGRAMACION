package ClaseEstructurasDeDatos;

import java.util.Scanner;

//9. Comparar arrays
//Pide al usuario que introduzca dos arrays de enteros del mismo tamaño y muestra
//cuántos elementos coinciden en la misma posición.
//Ejemplo:
//Array 1: {1, 2, 3, 4, 5}
//Array 2: {1, 4, 3, 0, 5}
//Coinciden en 3 posiciones (índices 0, 2 y 4).

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        // Pedir la cantidad de numeros

        System.out.println("Cuantos numeros tiene el primer array? ");
        int cantidad1 = sc.nextInt();
        System.out.println("Cuantos numeros tiene el segundo array? ");
        int cantidad2 = sc.nextInt();


        // Crear el array con ese tamaño

        int [] enteros1 = new int[cantidad1];
        int [] enteros2 = new int[cantidad1];

    for (int i = 0; i < cantidad1; i++){
        System.out.println("Introduce el numero  " + (i + 1) + " ");
        enteros1[i] = sc.nextInt();
        }

}
}