package ClaseEstructurasDeDatos;

import java.util.Arrays;

public class ejercicio5 {
    public static void main(String[] args) {

        int[] numeros = {10, 25, 30, 16, 58};

        Arrays.sort(numeros);

        for (int num : numeros) { // for each
            System.out.println(num);
        }
    }
}
