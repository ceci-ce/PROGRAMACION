package ClaseMatrices;

import java.util.ArrayList;
import java.util.Collection;

public class clase {
    public static void main(String[] args) {

        int[][] matriz_1 = new int[3][4];

        int[][] matriz_2 = {
                {2, 7, 0},
                {1, 4, 6},
                {0, 5, 3}
        };
    // Para saber el numero de filas y de columnas
        System.out.println("Número de filas: " + matriz_1.length);
        System.out.println("Número de columnas: " + matriz_2[1].length);

    // Imprimir la matriz
        for (int i = 0; i < matriz_2.length; i++){
            for (int j = 0; j < matriz_2[i].length; j++){
                System.out.print(matriz_2[i][j] + " "); // Se quita el ln para que no salte de linea
            }
            System.out.println();
            }
    // Modificar un valor de la matriz segun la posicion
        matriz_2[1][1] = 30;

    // Recorrer matriz con for-each

        for (int[] fila: matriz_2){ // Se recorren las filas --> se recorren vecores de enteros(cada fila es un vector)
            for (int valor : fila){ // Se recorren los enteros
                System.out.print(valor + " ");
            }
            System.out.println();
        }

    }
}
