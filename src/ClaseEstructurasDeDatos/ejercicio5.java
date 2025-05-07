package ClaseEstructurasDeDatos;
import java.util.Arrays;

//5. Ordenar el array
//Declara un array con números desordenados y ordénalo de menor a mayor utilizando
//Arrays.sort().

public class ejercicio5 {
    public static void main(String[] args) {

        int[] numeros = {10, 25, 30, 16, 58};

        // Mostrar array antes de ordenar
        System.out.println("Array original: " + Arrays.toString(numeros));

        // Ordenar el array de menor a mayor
        Arrays.sort(numeros);

//        for (int num : numeros) { // for each
//            System.out.println(num);
       // }
        // Mostrar array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
