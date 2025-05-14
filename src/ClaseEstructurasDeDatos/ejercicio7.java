package ClaseEstructurasDeDatos;
import java.util.*;

//7. Copiar sin duplicados
//Dado un array con posibles números repetidos, crea un nuevo array que contenga los
//mismos elementos sin duplicados.
//Ejemplo: {1, 2, 2, 3, 4, 4, 5} → {1, 2, 3, 4, 5}.

public class ejercicio7 {
    public static void main(String[] args) {

        int [] repetidos = {1, 2, 2, 3, 4, 4, 5};
        int [] temporal = new int[repetidos.length];
        int tamaño = 0;

        // Recorrer cada elemento del array original
        for (int i = 0; i < repetidos.length; i++){ //Recorres cada elemento de repetidos.
            boolean duplicado = false; //Inicializas una variable duplicado = false para comprobar si ese número ya ha sido añadido.


            // Verificar si ya está en el array temporal
            for (int j = 0; j < tamaño; j++){
                if (repetidos[i] == temporal[j]){ //Buscas si el número actual (repetidos[i]) ya está en temporal.

                    duplicado = true; //Si lo está, pones duplicado = true y sales del bucle interno.
                    break;
                }
            }

            // Si no está duplicado, lo agregamos al array temporal
            if(!duplicado){
                temporal[tamaño] = repetidos[i]; //Se usa la variable tamaño para saber en qué posición guardar, y luego se incrementa.
                tamaño++;
            }
        }
        // Crear array final sin duplicados con tamaño exacto

        int [] sinDuplicados = new int[tamaño];
        for (int i = 0; i< tamaño;i++){
            sinDuplicados[i] = temporal[i];
        }

        // Mostrar resultado
        System.out.println("Array sin duplicados: ");
        for (int num : sinDuplicados){
            System.out.println(num + " ");
        }
    }
}
