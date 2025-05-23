package ClaseMatrices;

//3. Matriz de Identidad:
//Crea una matriz de 3x3 que sea una matriz identidad (con 1 en la diagonal principal y 0 en
//el resto).
//Imprime la matriz.

public class ejercicio3 {
    public static void main(String[] args) {

        int[][] matrizIdentidad = new int[3][3]; // Creamos una matriz vacia de 3x3

        // Recorremos la matriz con dos bucles for anidados

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    matrizIdentidad[i][j] = 1; // Si es diagonal (i==j), ponemos 1 Esta instrucción asigna el valor 1 a una celda específica de una matriz llamada matrizIdentidad
                } else {
                    matrizIdentidad[i][j] = 0; // Si no, ponemos 0

                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizIdentidad[i][j] + " ");
            }
            System.out.println();
        }
    }
}
