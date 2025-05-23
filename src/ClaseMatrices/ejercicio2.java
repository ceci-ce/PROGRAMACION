package ClaseMatrices;
import java.util.Random;

//2. Rellenar una Matriz con Números Aleatorios:
//Crea una matriz de 4x4 y rellénala con números aleatorios entre 1 y 100.
//Imprime la matriz.

public class ejercicio2 {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        Random random = new Random();

        //Generacion de matriz con numeros aleatorios
        for (int i = 0; i < 4; i++) { //en cada recorrido se mete un numero aleatorio entre 1 y 100
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100) + 1; //crea valores aleatorios entre el 0 y el 99, por eso se suma el 1
            }
        }

        //Impresion de la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
