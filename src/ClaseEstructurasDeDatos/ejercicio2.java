package ClaseEstructurasDeDatos;
import java.util.Scanner;
import java.util.Arrays;

//2. Sumar elementos
//Suma todos los valores de un array de enteros y muestra el total.

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int[] numeros = {2, 6, 20, 3, 32};
     //   int suma = 0; // variable para acumular la suma

     //   System.out.println("Los numeros del array son: " + Arrays.toString(numeros));
//
//        for (int num: numeros){
//            suma += num; // suma = suma + num
//        }
//        System.out.println("La suma total de los valores del array es de: " + suma);


//        for (int i = 0; i < numeros.length; i++) {
//            suma += numeros[i];//Dentro del bucle, se usa el índice i para ir acumulando la suma
//            //System.out.println(numeros[i] + " ");
//        }
//        System.out.println("La suma total de los valores del array es de: " + suma);

        // pedir al usuario una cantidad de números, sumarlos, y mostrar el total
        System.out.println("Cuantos numeros vas a sumar? ");
        int cantidad = sc.nextInt(); // Se crea un array con x posiciones, segun la cantidad de numeros que dice el usuario

        int[] numeros = new int[cantidad]; // Creamos el array de tamaño 'cantidad'
        int suma = 0;

        for (int i = 0; i < cantidad; i++){
            System.out.println("Introduce el numero: " + (i + 1) + " "); // i + 1 es solo para que el mensaje se vea como "número 1", "número 2", etc.
            numeros [i] = sc.nextInt(); // Guardamos el número introducido en la posición i del array; se repite en un for para llenar varias posiciones del array.
            suma += numeros [i];
        }
       System.out.println("La suma total de los valores del array es de: " + suma);
        sc.close();
    }
}