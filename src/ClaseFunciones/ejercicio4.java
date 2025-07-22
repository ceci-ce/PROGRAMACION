package ClaseFunciones;

import java.util.Scanner;

//4. Reorganiza este código en funciones
//Convierte este código en un programa que use mínimo dos funciones: una para cargar datos, y
//otra para imprimirlos.
//Scanner sc = new Scanner(System.in);
//String nombre;
//int edad;
//
//System.out.print("Introduce tu nombre: ");
//nombre = sc.nextLine();
//
//System.out.print("Introduce tu edad: ");
//edad = sc.nextInt();
//
//System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

public class ejercicio4 {
    public static void main(String[] args) {

        String[] datos = cargarDatos(); // Llama a la función y guarda los datos
        imprimirDatos(datos[0], Integer.parseInt(datos[1]));
    }

    // Función para cargar nombre y edad
    public static String[] cargarDatos() {
        Scanner sc = new Scanner(System.in);
        String[] datos = new String[2];

        System.out.println("Introduce tu nombre: ");
        datos[0] = sc.nextLine();

        System.out.println("Introduce tu edad: ");
        datos[1] = sc.nextLine();

        sc.close();

        return datos;
    }

    // Función para imprimir los datos
    public static void imprimirDatos(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }
}
