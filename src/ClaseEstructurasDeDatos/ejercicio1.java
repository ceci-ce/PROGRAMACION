package ClaseEstructurasDeDatos;
import java.util.Scanner;
import java.util.Arrays;

//1. Declarar y mostrar
//Declara un array de 5 números enteros, asígnales valores y muéstralos por pantalla.

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5]; //Definimos el vector

        // Pedir al usuario los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el numero" + (i+1) + ":");
            numeros[i] = sc.nextInt();
        }
        System.out.println("\n Recorrido con FOR: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + (i+1) + numeros[i]); //Para acceder a la posiciom del vector. Nombre del vector, [], indice. Se pone i para sacar todos los numeros
        }
        System.out.println("\n Recorrido con FOR-EACH: ");
        int contador = 1;
        for (int  num: numeros){ //for each, mejor opccion
            System.out.println("Elemento: "+ contador + ": " + num);
            contador ++;
        }
        System.out.println("\n Recorrido con WHILE:");
        int i = 0;
        while (i < numeros.length){
           System.out.println("Elemento: " + (i+1) + ":" + numeros[i]);
           i++;
       }
        System.out.println("\n Recorrido con STREAM:");
        Arrays.stream(numeros).forEach(n -> System.out.println("Elemento: " + n));

        Arrays.stream(numeros).forEach( num -> System.out.println("Elemento: " + num ) ); // Otra forma de hacer un foreach mas simple
// Sumar con foreach
        int sumaForeach = 0;
        for (int numero : numeros) {
            sumaForeach += numero;
        }
        System.out.println("\n Suma con FOR-EACH: " + sumaForeach);

        // Sumar con stream
        int sumaStream = Arrays.stream(numeros).sum();
        System.out.println("Suma con STREAM: " + sumaStream);
    }
}



