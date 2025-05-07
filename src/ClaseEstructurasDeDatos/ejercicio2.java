package ClaseEstructurasDeDatos;

import java.util.Arrays;

//2. Sumar elementos
//Suma todos los valores de un array de enteros y muestra el total.

public class ejercicio2 {
    public static void main(String[] args) {

        int [] numeros = {2,6,20,3,32};
        int suma = 0;

        System.out.println("Los numeros del array son: " + Arrays.toString(numeros));

        for (int num: numeros){
            suma += num; // suma = suma + num
        }
        System.out.println("La suma total de los valores del array es de: " + suma);
    }
}
