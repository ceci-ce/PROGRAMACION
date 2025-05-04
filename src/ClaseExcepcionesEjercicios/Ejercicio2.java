// Ejercicio 2: Convertidor de texto a número
//
//Objetivo: Añadir manejo de NumberFormatException

//Instrucción: Añade un bloque try-catch para evitar que el programa se rompa si el usuario escribe letras.

package ClaseExcepcionesEjercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Escribe un número (en texto): ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto); // Puede lanzar NumberFormatException / // Intentamos convertir el texto a un número entero

            System.out.println("Número x 10: " + (numero * 10)); // Si funciona, lo multiplicamos por 10

        } catch ( NumberFormatException e){
            System.out.println("Error: No has escrito un número válido."); // Si falla, mostramos mensaje
        }

        sc.close();

    }
}

/*
🧠 ¿Qué está pasando dentro del try?
Integer.parseInt(texto) intenta transformar un String como "123" en un número entero 123.

Si el usuario escribe "hola" o "12.5" o "ciento uno", Java no lo puede transformar en int, y lanza una NumberFormatException.

Gracias al catch, el programa no se rompe y da un mensaje amigable al usuario.

*/
