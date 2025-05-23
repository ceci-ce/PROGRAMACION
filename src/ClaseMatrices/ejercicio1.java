package ClaseMatrices;
//1. Suma de Dos Matrices:
//Crea dos matrices de 3x3 y suma sus elementos.
//Imprime el resultado de la suma.
public class ejercicio1 {
    public static void main(String[] args) {

        // Paso 1: Declaramos e inicializamos las dos matrices de 3x3

        int[][] matriz1 = {
                {2, 7, 0},
                {1, 4, 6},
                {0, 5, 3}
        };

        int[][] matriz2 = {
                {2, 7, 0},
                {1, 4, 6},
                {0, 5, 3}
        };

        // Paso 2: Creamos una nueva matriz para guardar la suma

        int [][] matrizSuma = new int[3][3];

        // Paso 3: Recorremos las matrices con dos bucles for anidados

        for (int i = 0; i < 3; i++){
           for (int j = 0; j < 3; j++){
               // Suma de elementos en la misma posición [i][j]
               matrizSuma [i][j] = matriz1[i][j] + matriz2[i][j];
           }
        }
        // Paso 4: Mostramos la matriz resultante por pantalla
        System.out.println("Matriz resultante de la suma: ");
        for (int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.print(matrizSuma[i][j] + " ");
            }
            System.out.println(); // Salto de línea para ver la matriz como una tabla
        }
    }
}

