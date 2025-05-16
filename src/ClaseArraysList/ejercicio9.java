package ClaseArraysList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

//9. Convertir array a lista
//Dado un array de enteros, conviértelo a una ArrayList<Integer> y muestra su contenido.

public class ejercicio9 {
    public static void main(String[] args) {

        int [] enteros = {1,4,6,9,2};
        ArrayList<Integer> listaEnteros = new ArrayList<>();

        //Convertir el array a ArrayList

        for (int num:enteros){
            listaEnteros.add(num);
        }
        System.out.println("Contenido de la lista: ");
        for(int num: listaEnteros){
            System.out.println(num);
        }
    }
}
