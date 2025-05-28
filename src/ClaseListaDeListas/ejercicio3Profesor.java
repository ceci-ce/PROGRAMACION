package ClaseListaDeListas;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3Profesor {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> ciudades = new ArrayList<>();

        ArrayList<String> europeas = new ArrayList<>();
        europeas.add("Madrid");
        europeas.add("París");
        europeas.add("Roma");

        ArrayList<String> americanas = new ArrayList<>();
        americanas.add("Bogotá");
        americanas.add("Buenos Aires");
        americanas.add("Quito");

        ArrayList<String> asiaticas = new ArrayList<>();
        asiaticas.add("Tokio");
        asiaticas.add("Seúl");
        asiaticas.add("Bangkok");

        ciudades.add(europeas);
        ciudades.add(americanas);
        ciudades.add(asiaticas);

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una ciudad para buscar: ");
        String ciudadBuscada = sc.nextLine().trim();

        boolean encontrada = false;
        int indice = 0;

        for (ArrayList<String> lista : ciudades) {
            if (lista.contains(ciudadBuscada)) {
                System.out.println("La ciudad se encuentra en la lista " + (indice + 1) + ": " + lista);
                encontrada = true;
                break;
            }
            indice++;
        }

        if (!encontrada) {
            System.out.println("La ciudad no se encuentra en ninguna lista.");
        }
    }
}
