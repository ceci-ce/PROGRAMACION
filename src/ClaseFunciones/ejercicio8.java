package ClaseFunciones;

import java.util.Scanner;

//8. Función que reciba dos enteros y devuelva el mayor
//Llama a la función desde el main y muestra el resultado.

public class ejercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.println("Dime el segundo numero entero: ");
        int num2 = scanner.nextInt();

        int mayor = obtenerMayor(num1,num2);
        System.out.println("El numero mayor es: " + mayor);

        scanner.close();

    }

    public static int obtenerMayor(int n1, int n2){
        if(n1 > n2){
            return n1;
        }else {
            return n2;
        }
    }
}
