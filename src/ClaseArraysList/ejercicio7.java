package ClaseArraysList;

//7. Añadir y eliminar elementos
//Crea una lista de tareas (ArrayList<String>), añade elementos y elimina uno por su nombre.

import java.util.ArrayList;

public class ejercicio7 {
    public static void main(String[] args) {

        ArrayList<String> tareas = new ArrayList<>();

        tareas.add("Organizar");
        tareas.add("Recoger");
        tareas.add("Limpiar");

        System.out.println("Tareas a realizar: ");
        for(String tarea: tareas){
            System.out.println("- " + tarea);
        }

        String tareaAEliminar = "Limpiar"; //Se guarda en la variable tareaAEliminar el nombre exacto de la tarea que queremos eliminar.
        boolean eliminada = tareas.remove(tareaAEliminar); //busca ese texto en la lista y, si lo encuentra, lo elimina.
                                                        //Si la encuentra y la elimina, devuelve true. Si no la encuentra, devuelve false.
                                                        //Ese valor (true o false) se guarda en la variable eliminada.

        if (eliminada == true){
            System.out.println("\nTarea eliminada: " + tareaAEliminar);
        }else{
            System.out.println("\nNo se encontró la tarea: " + tareaAEliminar);
        }

        System.out.println("\nTareas actualizadas: ");
        for(String tarea: tareas){
            System.out.println("- " + tarea);
        }
        }
    }

