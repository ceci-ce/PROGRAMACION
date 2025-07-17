package ClaseMapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//5. Ordenar un Mapa por Claves:
//Crea un HashMap<String, Double> que almacene nombres de productos y sus precios.
//Usa un TreeMap para ordenar los productos por nombre de forma alfabética.
//Imprime el mapa ordenado.

public class ejercicio5 {
    public static void main(String[] args) {

        HashMap<String, Double> comprasRebajas = new HashMap<>();

        comprasRebajas.put("Chanclas", 4.75);
        comprasRebajas.put("Pantalones", 35.99);
        comprasRebajas.put("Vestidos", 47.50);
        comprasRebajas.put("Bikinis", 27.20);

        TreeMap<String, Double> preciosOrdenados = new TreeMap<>(comprasRebajas);

        System.out.println("Lista de cosas de las rebajas y sus precios: ");
        for(Map.Entry<String, Double> entry: preciosOrdenados.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue() + "€");
        }
    }
}
