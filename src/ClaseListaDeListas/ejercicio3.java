package ClaseListaDeListas;

import java.util.ArrayList;
import java.util.Scanner;

//3. Búsqueda de un Elemento en una Lista Interna:
//Crea un ArrayList<ArrayList<String>> que almacene nombres de ciudades en cada lista interna.
//Permite al usuario ingresar una ciudad para buscar en qué lista se encuentra.
//Imprime la lista que contiene la ciudad.

public class ejercicio3 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> ciudades = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una ciudad: ");
        String ciudadUsuario = sc.nextLine().trim();
        sc.close();

        ArrayList<String> europa = new ArrayList<>();
        europa.add("Madrid");
        europa.add("Niza");
        europa.add("Zagreb");

        ArrayList<String> america = new ArrayList<>();
        america.add("La Habana");
        america.add("Nueva York");
        america.add("Lima");

        ArrayList<String> asia = new ArrayList<>();
        asia.add("Yakarta");
        asia.add("Manila");
        asia.add("Tokio");

        ciudades.add(europa);
        ciudades.add(america);
        ciudades.add(asia);

        ArrayList<String> continentes = new ArrayList<>();
        continentes.add("Europa");
        continentes.add("América");
        continentes.add("Asia");

        boolean encontrada = false;

        for(int i = 0; i < ciudades.size();i++){
            ArrayList<String> listaCiudades = ciudades.get(i);
            if (listaCiudades.contains(ciudadUsuario)){
                System.out.println("La ciudad está en " + continentes.get(i));
                encontrada = true;
                break;
            }
        }

        if(!encontrada){ // (encontrada == false)
            System.out.println("Ciudad no encontrada");
        }
    }
}
