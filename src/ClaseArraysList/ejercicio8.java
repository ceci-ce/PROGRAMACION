package ClaseArraysList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

//8. Buscar en la lista
//Pregunta al usuario un nombre, y busca si está en la lista. Si está, muestra su posición.

public class ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       ArrayList<String> nombres = new ArrayList<>(Arrays.asList(
               "Cecilia","Ale","Bali","Margarita"
       ));

        System.out.println("Introduce un nombre para buscar: ");
        String nombreBuscado = sc.nextLine();

        int posicion = nombres.indexOf(nombreBuscado);

        if(posicion != -1){ //Si el elemento existe, devuelve su indice, si no devuelve -1
            System.out.println(nombreBuscado + " está en la posición " + (posicion + 1));
        }else{
            System.out.println(nombreBuscado + " no está en la lista");
        }
    sc.close();
    }
}
