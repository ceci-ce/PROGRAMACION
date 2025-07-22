package ClaseFunciones;

import java.util.Scanner;

//9. Descompón este programa en funciones
//Este programa imprime una tabla de multiplicar. Crea una función tablaMultiplicar(int n) que
//reciba un número y muestre su tabla.
//
//int numero = 5;
//for (int i = 1; i <= 10; i++) {
//System.out.println(numero + " x " + i + " = " + (numero * i));
//}

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");

        int numUsuario = sc.nextInt();
        tablaMultiplicar(numUsuario);
    }

    public static void tablaMultiplicar(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
