package ClaseArraysList;
import java.util.ArrayList;
import java.util.Scanner;

//6. Crear una lista de nombres
//Crea una ArrayList de tipo String, añade 5 nombres y muéstralos por pantalla.

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce 5 nombres: ");
        String nombre;

        do{
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            if (!nombre.equalsIgnoreCase("salir")){
                nombres.add(nombre);
            }
        }while (!nombre.equalsIgnoreCase("salir"));

        System.out.println("La lista de nombres es: " + nombres);
        sc.close();
    }
}
