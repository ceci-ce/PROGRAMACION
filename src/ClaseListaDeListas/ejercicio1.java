package ClaseListaDeListas;

//1. Lista de Listas de Estudiantes:
//Crea un ArrayList<ArrayList<String>> que contenga información sobre 3 estudiantes:
//nombre, apellido y edad.
//Imprime la información de todos los estudiantes.

import java.util.ArrayList;

public class ejercicio1 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> estudiantes = new ArrayList<>();

        ArrayList<String> estudiante3 = new ArrayList<>();
        estudiante3.add("Ana");
        estudiante3.add("Martin");
        estudiante3.add("28");

        ArrayList<String> estudiante4 = new ArrayList<>();
        estudiante4.add("Alberto");
        estudiante4.add("Ramirez");
        estudiante4.add("22");

        ArrayList<String> estudiante5 = new ArrayList<>();
        estudiante5.add("Petra");
        estudiante5.add("Diaz");
        estudiante5.add("24");

        estudiantes.add(estudiante3);
        estudiantes.add(estudiante4);
        estudiantes.add(estudiante5);

        for (ArrayList<String> estudiante : estudiantes) {
            System.out.println("Estudiante: ");
            for (String informacion : estudiante) {
                System.out.println(" - " + informacion);
            }
            System.out.println();
        }
    }
}
