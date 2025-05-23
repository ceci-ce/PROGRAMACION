package ClaseMatrices;

//4. Transposición de una Matriz:
//Crea una matriz de 2x3 y transponla, es decir, convierte sus filas en columnas.
//Imprime la matriz original y la transpuesta.

public class ejercicio4 {
    public static void main(String[] args) {

        int[][] matriz5 = {
                {2, 7, 0},
                {1, 4, 6}
        };

        int[][] matrizTranspuesta = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrizTranspuesta[i][j] = matriz5[j][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizTranspuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}