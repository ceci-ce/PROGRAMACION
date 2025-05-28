package ClaseListaDeListas;

import java.util.ArrayList;

//2. Agregar una Lista a una Lista de Listas:
//Crea un ArrayList<ArrayList<String>> y agrega 3 listas internas.
//Cada lista interna debe contener un nombre y dos apellidos de un estudiante.
//Imprime la lista de listas.

public class ejercicio2 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> estudiantes2 = new ArrayList<>();

        ArrayList<String> estudiante6 = new ArrayList<>();
        estudiante6.add("Ana");
        estudiante6.add("Martin");
        estudiante6.add("Martinez");

        ArrayList<String> estudiante7 = new ArrayList<>();
        estudiante7.add("Alberto");
        estudiante7.add("Ramirez");
        estudiante7.add("Ramiro");

        ArrayList<String> estudiante8 = new ArrayList<>();
        estudiante8.add("Petra");
        estudiante8.add("Diaz");
        estudiante8.add("Jimenez");

        estudiantes2.add(estudiante6);
        estudiantes2.add(estudiante7);
        estudiantes2.add(estudiante8);

        for (ArrayList<String> alumno2 : estudiantes2){
            System.out.println("Alumno: ");
            for(String datos : alumno2){
                System.out.println(" - " + datos);
            }
            System.out.println();
        }
    }
}
