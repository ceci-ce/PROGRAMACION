package ClaseArraysList;
import java.util.ArrayList;
import java.util.Scanner;

//6. Crear una lista de nombres
//Crea una ArrayList de tipo String, añade 5 nombres y muéstralos por pantalla.

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce hasta 5 nombres (o escribe 'salir' para terminar): ");
        String nombre;

        do{
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            if (!nombre.equalsIgnoreCase("salir")){
                nombres.add(nombre);
            }
        }while (nombres.size() < 5 && !nombre.equalsIgnoreCase("salir"));

        System.out.println("\nLa lista de nombres es: ");
        for (String n: nombres){
            System.out.println(n);
        }
        sc.close();
    }
}
