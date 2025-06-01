package ClaseMapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import java.util.HashMap;

public class clase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Ana", 8.5);
        notas.put("Anita", 7.0);
        notas.put("Jose", 6.5);
        notas.put("Joselito", 9.0);
        notas.put("Anus", 7.0);
        notas.put("Ñene", 6.5);
        notas.put("Luis", 9.0);

        for(Map.Entry<String, Double> entrada: notas.entrySet()){
            System.out.println(entrada.getKey() + "->" + entrada.getValue());
        }
        System.out.println("Introduce un nombre: ");
        String nombre = scanner.nextLine();

        if(notas.containsKey(nombre)){ // Comprueba si existe la clave que pasa el usuario por teclado
            System.out.println(nombre + "tiene una nota de " + notas.get(nombre));
        }else{
            System.out.println("Estudiante no encontrado");
        }
    }
}
