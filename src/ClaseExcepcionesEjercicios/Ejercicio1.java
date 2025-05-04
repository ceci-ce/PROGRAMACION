//Ejercicio 1: División segura
//
//Objetivo: Añadir manejo de ArithmeticException y InputMismatchException

//Instrucción: Añade try-catch-finally para evitar que el programa falle si el divisor es cero o si se introduce texto.

package ClaseExcepcionesEjercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce el dividendo: ");
            int a = sc.nextInt(); // si el usuario mete texto, lanza InputMismatchException

            System.out.print("Introduce el divisor: ");
            int b = sc.nextInt(); // puede lanzar InputMismatchException

            int resultado = a / b; // Puede lanzar ArithmeticException si b == 0

            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e){
            System.out.println("Error: Debes introducir numeros enteros.");

        } catch (ArithmeticException e){
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            sc.close(); // Se ejecuta siempre, haya o no error
            System.out.println("Programa finalizado");
        }
    }
}

/* 🧠 ¿Qué hace cada parte?
try: Intenta ejecutar el código que podría fallar.

catch (InputMismatchException): Captura si el usuario mete letras en vez de números.

catch (ArithmeticException): Captura si el divisor es 0.

finally: Siempre se ejecuta, para cerrar recursos como el Scanner.

 */