package ClaseFunciones;

import java.util.Scanner;
import java.util.Locale;


// Ejercicio parecido al 6 para practicar

// Título: Calcular el promedio de notas de varios alumnos
//Enunciado:
//Crea un programa en Java que:
//
//Pida al usuario que introduzca las notas (tipo double) de 5 alumnos.
//
//Guarde esas notas en un array.
//
//Use una función para leer las notas y otra para calcular el promedio.
//
//Muestra el promedio final con 2 decimales.
//
//Requisitos técnicos:
//Una función leerNotas() que devuelva un array double[] con las 5 notas.
//
//Una función calcularPromedio(double[] notas) que reciba ese array y devuelva el promedio.
//
//En el main, llamar a ambas funciones y mostrar el resultado final.

public class ejercicio6b {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double [] notasAlumnos = leerNotas();

       double mediaNotas = calcularPromedio(notasAlumnos);

        System.out.println("La media de las notas de los alumnos es: " + mediaNotas);
    }

    // Funcion para leer notas
    public static double [] leerNotas(){

        Scanner sc = new Scanner(System.in);

        double [] notasAlumnos = new double[5];

        System.out.println("Nota 1: ");
        notasAlumnos[0] = sc.nextDouble();

        System.out.println("Nota 2: ");
        notasAlumnos[1] = sc.nextDouble();

        System.out.println("Nota 3: ");
        notasAlumnos[2] = sc.nextDouble();

        System.out.println("Nota 4: ");
        notasAlumnos[3] = sc.nextDouble();

        System.out.println("Nota 5: ");
        notasAlumnos[4] = sc.nextDouble();

        return notasAlumnos;
    }

    //Funcion para calcular la media

    public static double calcularPromedio(double[] notas){
        double totalNotas = 0;

        for(double n: notas){
            totalNotas += n;

        }
        return totalNotas/notas.length;
    }
}
