// Ejercicio 4: Adivina el número aleatorio
//
//Objetivo: Añadir manejo de NumberFormatException al convertir texto a número

//Instrucción: Añade manejo de NumberFormatException y un finally que diga: "Juego finalizado."

package ClaseExcepcionesEjercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        int secreto = random.nextInt(10) + 1;
        Scanner sc = new Scanner(System.in); // ← se declara fuera del try

        try {
          System.out.print("Adivina el número (1-10): ");
          String intentoTexto = sc.nextLine();

          int intento = Integer.parseInt(intentoTexto);

          if (intento == secreto) {
              System.out.println("¡Correcto!");
          } else {
              System.out.println("Incorrecto. El número era: " + secreto);
          }
      }catch (NumberFormatException e){
          System.out.println("Error: Tienes que introducir un numero.");
      } finally {
          sc.close();
          System.out.println("Juego finalizado");
      }
    }
}
