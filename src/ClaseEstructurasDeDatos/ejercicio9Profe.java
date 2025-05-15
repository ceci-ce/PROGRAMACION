package ClaseEstructurasDeDatos;
import java.util.Scanner;

public class ejercicio9Profe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TAM = 5;
        int[] array1 = new int[TAM];
        int[] array2 = new int[TAM];

        // Leer array 1
        System.out.println("Introduce los elementos del primer array:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Elemento " + i + ": ");
            array1[i] = scanner.nextInt();
        }

        // Leer array 2
        System.out.println("Introduce los elementos del segundo array:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Elemento " + i + ": ");
            array2[i] = scanner.nextInt();
        }

        // Comparar posiciones
        int coincidencias = 0;
        for (int i = 0; i < TAM; i++) {
            if (array1[i] == array2[i]) {
                coincidencias++;
            }
        }

        System.out.println("Coinciden en " + coincidencias + " posiciones.");
        scanner.close();
    }
}
