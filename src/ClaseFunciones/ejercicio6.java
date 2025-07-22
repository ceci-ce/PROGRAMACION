package ClaseFunciones;

import java.util.Scanner;

//6. Código para convertir en funciones
//Este código calcula el área de un rectángulo.
//Divídelo en dos funciones: una para leer datos y otra para calcular el área.
//
//Scanner sc = new Scanner(System.in);
//System.out.print("Introduce base: ");
//double base = sc.nextDouble();
//System.out.print("Introduce altura: ");
//double altura = sc.nextDouble();
//
//double area = base * altura;
//System.out.println("El área es: " + area);

public class ejercicio6 {
    public static void main(String[] args) {

        double [] datos = datosRectangulo();
        double area = calcularArea(datos[0], datos[1]);
        System.out.println("El area del rectangulo es: " + area);
    }

    // Funcion leer datos

    public static double [] datosRectangulo(){

        Scanner sc = new Scanner(System.in);
        double datos [] = new double[2];

        System.out.print("Introduce base: ");
        datos[0] = sc.nextDouble();

        System.out.print("Introduce altura: ");
        datos[1] = sc.nextDouble();

        return datos;
    }
    // Funcion calcular area

    public static double calcularArea(double base, double altura){
        return base * altura;
    }
}
