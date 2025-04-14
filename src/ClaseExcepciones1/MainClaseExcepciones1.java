package ClaseExcepciones1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClaseExcepciones1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Saludar\n2. Salir");

        System.out.println("Elige una opción");

        try {

            int opcion = entrada.nextInt();

            int resultado = 5 / opcion;

            switch (opcion) {
                case 1 -> {  // -> Formato distinto al de : , que no necesita break
                    System.out.println("Hola");
                    System.out.println("Hola");
                }

                case 2 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción incorrecta");
            }
        } catch (InputMismatchException e) { //Usar una excepcion especifica en vez de generica
            System.out.println("Debes de escribir un número");
        } catch (ArithmeticException e) {
            System.out.println("No puedes dividir por cero");
        } finally {
            System.out.println("FIN");
        }
        entrada.close();
    }
}
