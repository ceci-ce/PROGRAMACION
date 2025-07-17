package ClaseMapas;

import java.util.HashMap;
import java.util.Map;

//4. Actualizar el Valor de una Clave en un Mapa:
//Crea un HashMap<String, Integer> que almacene productos y sus cantidades.
//Actualiza la cantidad de un producto y luego muestra el mapa actualizado.

public class ejercicio4 {
    public static void main(String[] args) {

        HashMap<String, Integer> productos = new HashMap<>();

        productos.put("Fresas", 14);
        productos.put("Tomates", 8);
        productos.put("Cebollas", 3);
        productos.put("Atun", 2);
        productos.put("Guacamole", 2);
        productos.put("Nachos", 1);


        System.out.println("Mapa original de productos y sus cantidades: ");
        for(Map.Entry<String, Integer> entry: productos.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("\n---------------------------");


        // Actualizamos la cantidad de nachos

        productos.put("Nachos", 4);

        System.out.println("Mapa despues de modificar la cantidades de nachos: ");
        for(Map.Entry<String, Integer> entry: productos.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
    }
}
