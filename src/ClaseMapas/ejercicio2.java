package ClaseMapas;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;


//2. Buscar un Valor en un Mapa:
//Crea un HashMap<String, String> que almacene nombres de países como claves y sus capitales como valores.
//Permite al usuario ingresar el nombre de un país para mostrar su capital.

public class ejercicio2 {
    public static void main(String[] args) {

        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("Portugal", "Lisboa");
        capitales.put("España", "Madrid");
        capitales.put("Francia", "París");
        capitales.put("Italia", "Roma");
        capitales.put("Alemania", "Berlín");
        capitales.put("Inglaterra", "Londres");
        capitales.put("Irlanda", "Dublín");
        capitales.put("Marruecos", "Rabat");
        capitales.put("Egipto", "El Cairo");
        capitales.put("Estados Unidos", "Washington D.C.");
        capitales.put("Canadá", "Ottawa");
        capitales.put("Colombia", "Bogotá");
        capitales.put("Argentina", "Buenos Aires");
        capitales.put("China", "Pekín");
        capitales.put("Japón", "Tokio");

        System.out.print("Introduce un país: ");
        Scanner sc = new Scanner(System.in);
        String pais = sc.nextLine().trim();

        if (capitales.containsKey(pais)){
            System.out.println("La capital de " + pais + " es " + capitales.get(pais));
        } else{
            System.out.println("País no encontrado.");
        }
        System.out.println("\n---------------------------");
    }
}
