package ClaseMatrices;

//5. Multiplicación de Matrices:
//Crea dos matrices de 2x2 y multiplícalas.
//Imprime el resultado de la multiplicación.

public class ejercicio5 {
    public static void main(String[] args) {

        int[][] matriz3 = {
                {2, 6},
                {3, 1}
        };

        int[][] matriz4 = {
                {3, 0},
                {7, 4}
        };

        int[][] matrizMultiplicacion = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizMultiplicacion[i][j] = matriz3[i][j] * matriz4[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizMultiplicacion[i][j] + " ");
            }
            System.out.println();
        }
    }
}
