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

        System.out.println("Cuantos numeros tiene el array? ");
        int cantidad = sc.nextInt();

        // Crear el array con ese tamaño

        int [] enteros1 = new int[cantidad];
        int [] enteros2 = new int[cantidad];

        // Leer el primer array
        for (int i = 0; i < cantidad; i++){
        System.out.println("Introduce el numero  " + (i + 1) + " del primer array: ");
        enteros1[i] = sc.nextInt();
        }

        // Leer el segundo array
        for (int i = 0; i < cantidad; i++){
            System.out.println("Introduce el numero " + (i + 1) + " del segundo array: ");
            enteros2[i] = sc.nextInt();
        }

        //Comparar posiciones
        int coincidencias = 0;
        for (int i = 0; i < cantidad; i++){
            if(enteros1[i] == enteros2[i]){
                coincidencias++;
            }
        }
        System.out.println("Coinciden en " + coincidencias + " posiciones.");
        sc.close();
    }
}