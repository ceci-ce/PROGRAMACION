package Clase2EstructurasDeControl;
import java.sql.SQLOutput;
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

//        for (int i = 1; i <= 20; i++) {
//            if (i == 7) {
//                System.out.println("Has encontrado el numero 7");
//                break;
//            }
//            System.out.println(i);
//        }
//    }
//}
//        Ejercicio 4 – Evitar mostrar letras vocales con continue
//         Muestra las letras de la palabra "PROGRAMACION", pero omite las vocales usando continue.

//    String palabra = "PROGRAMACION";
//    for (int i = 0;i < palabra.length();i++){
//        char letra = palabra.charAt(i);
//        if (letra == 'A'|| letra == 'E' || letra == 'I'|| letra == 'O' || letra == 'U') {
//        continue;
//        }
//        System.out.println(letra);
//}
//    }
//}
//        Ejercicio 5 – Dividir dos números con try-catch
//        Haz un programa que divida dos números enteros introducidos por el usuario. Usa try-catch para evitar que
//        el programa se rompa si el divisor es 0.

//    Scanner scanner = new Scanner(System.in);
//
//    //Solicitar el primer numero
//        System.out.println("Dime un numero: ");
//        int num1 = scanner.nextInt();
//
//    //Solicitar el segundo numero
//        System.out.println("Dime otro numero: ");
//       int num2 = scanner.nextInt();
//
//    //Intentar controlar la division, intentando que el resultado no sea 0
//        try{
//            int resultado = num1 / num2;
//            System.out.println("El resultado de la division es: " + resultado);
//        } catch (ArithmeticException E){
//            System.out.println("Error, no se puede dividir por cero");
//        }
//        scanner.close();
//            }
//        }
//Explicaion:
//Java lanza automáticamente una excepción cuando detecta que estás haciendo una operación inválida en tiempo de
//ejecución. Una de esas operaciones inválidas es dividir entre cero.
//Lo que ocurre es:
//
//1. Java detecta el error en tiempo de ejecución.
//2. Al ver que hay un catch (ArithmeticException e), salta directamente allí y ejecuta el código dentro del catch.
//3. Así evitas que el programa se detenga con un error feo.
//
//🧠 En resumen:
//No necesitas comprobar manualmente si num2 == 0, porque Java ya lo hace por ti.
//El try-catch atrapa el error cuando eso ocurre, y te permite reaccionar con un mensaje personalizado en vez
//de que el programa se rompa.

//        Ejercicio 6 – Acceder a una posición no válida de una cadena (charAt) con control de excepción
//        Solicita una palabra al usuario y pide una posición. Intenta mostrar el carácter en esa posición usando
//        try-catch. Si se produce un error, muestra un mensaje.


        Scanner scanner = new Scanner(System.in);

        //Solicitar palabra al usuario

        System.out.println("Dime una palabra: ");
        String palabra = scanner.next();

        //Pedir una posicion dentro de la palabra
        System.out.println("Dime una posicion dentro de la palabra: ");
        int posicion = scanner.nextInt();

        try {
            char resultado = palabra.charAt(posicion);
            System.out.println("La posicion de la palabra es: " + resultado);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Error: La posición indicada no existe en la palabra.");
        }
        scanner.close();
    }
}









