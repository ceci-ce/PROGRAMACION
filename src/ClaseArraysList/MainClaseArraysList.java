package ClaseArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClaseArraysList {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres (escribe 'salir' para finalizar):");
        String nombre;

        do {
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();
            if (!nombre.equalsIgnoreCase("salir")) {
                nombres.add(nombre);
            }
        } while (!nombre.equalsIgnoreCase("salir"));

        int opcion;
        do {
            System.out.println("\nMENU DE OPCIONES");
            System.out.println("1. Mostrar todos los nombres");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    if (nombres.isEmpty()) {
                        System.out.println("No hay nombres.");
                    } else {
                        System.out.println("Lista de nombres:");
                        for (String nom : nombres) {
                            System.out.println(" - " + nom);
                        }
                    }
                }
                case 0 -> System.out.println("FIN");
                default -> System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        entrada.close();
    }
}


