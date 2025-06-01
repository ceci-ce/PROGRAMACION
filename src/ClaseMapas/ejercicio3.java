package ClaseMapas;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

//3. Eliminar un Elemento de un Mapa:
//Crea un TreeMap<Integer, String> con claves numéricas y valores de colores.
//Elimina un color del mapa e imprime el mapa resultante.
public class ejercicio3 {
    public static void main(String[] args) {

        TreeMap<Integer, String> colores = new TreeMap<>();

        colores.put(1, "Blanco");
        colores.put(2, "Verde");
        colores.put(3, "Azul");
        colores.put(4, "Amarillo");
        colores.put(5, "Rojo");
        colores.put(6, "Rosa");
        colores.put(7, "Morado");
        colores.put(8, "Negro");

        System.out.println("Mapa original de colores: ");
        for(Map.Entry<Integer, String> entry: colores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Eliminamos color con clave 2(verde)
        colores.remove(2);

        System.out.println("Mapa después de eliminar el color con clave 2:");
        for (Map.Entry<Integer, String> entry : colores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("\n---------------------------");
    }
}
