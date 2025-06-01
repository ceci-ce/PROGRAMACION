package ClaseListaDeListas;

//5. Sumar Valores de una Lista de Listas:
//Crea un ArrayList<ArrayList<Integer>> que contenga varias listas con números.
//Suma todos los números dentro de las listas internas y muestra el resultado total.

import java.util.ArrayList;

public class ejercicio5 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> listaNumeros = new ArrayList<>();

        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(80);
        lista1.add(3);
        lista1.add(71);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(90);
        lista2.add(34);
        lista2.add(1);

        ArrayList<Integer> lista3 = new ArrayList<>();
        lista3.add(14);
        lista3.add(6);
        lista3.add(105);

        listaNumeros.add(lista1);
        listaNumeros.add(lista2);
        listaNumeros.add(lista3);

        int sumaTotal = 0;

        for(ArrayList<Integer> lista: listaNumeros){
            for(int num: lista){
                sumaTotal += num;
            }
        }
        System.out.println("La suma total es: " + sumaTotal);
    }
}
