package ClaseEstructurasDeDatos;
import java.util.Arrays;

//3. Valor máximo y mínimo
//Dado un array de enteros, muestra el valor más alto y el más bajo.

public class ejercicio3 {
    public static void main(String[] args) {

        int [] numeros = {21, 32, 8, 16};

        System.out.println("Los numeros del array son: " + Arrays.toString(numeros));

        // Inicializar minimo y maximo con el primer valor
        int max = numeros[0];
        int min = numeros[0];

        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > max){
                max = numeros[i];
            }
            if (numeros[i] < min){
                min = numeros[i];
            }
        }

        System.out.println("El valor mas alto es: " + max);
        System.out.println("El valor mas bajo es: " + min);
    }
}
