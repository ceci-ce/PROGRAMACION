package Clase2EstructurasDeControl;
import java.util.Scanner;


public class MainClase2EstructurasDeControl {
    public static void main(String[] args) {

//    Ejercicio 1 – Salir de un bucle while con break
//    Haz un programa que pida al usuario números enteros positivos. El programa debe terminar cuando el usuario
//    introduzca el número 0. Usa un bucle while con break.

//    Scanner sc = new Scanner(System.in);
//    int numero;
//
//    while(true){
//        System.out.println("Introduce un numero y pon 0 para salir");
//        numero = sc.nextInt();
//    if(numero == 0){
//        //Si es cero, como pide el enunciado,salgo de bucle
//        break;
//    }
//        System.out.println("Has introducido: " + numero);
//    }
//        System.out.println("Programa finalizado.");
//    sc.close();
//    }
//}
//    Ejercicio 2 – Saltarse los múltiplos de 3 con continue
//    Escribe un programa que muestre los números del 1 al 10, excepto los múltiplos de 3. Usa un bucle for con continue.

// Recorrer ese intervalo de números

//    for (int i = 1; i<=10; i++){
//        if(i%3 == 0){
//            //si es multiplo de 3,saltame
//            continue;
//        }
//        System.out.println(i);
//    }
//}
//}

//      Ejercicio 3 – Finalizar un bucle for al encontrar un número concreto
//      Haz un programa que busque el número 7 entre los números del 1 al 20. Cuando lo encuentre, debe mostrar un
//      mensaje y terminar el bucle con break.

        for (int i = 1; i <= 20; i++) {
            if (i == 7) {
                System.out.println("Has encontrado el numero 7");
                break;
            }
            System.out.println(i);
        }
    }
}



