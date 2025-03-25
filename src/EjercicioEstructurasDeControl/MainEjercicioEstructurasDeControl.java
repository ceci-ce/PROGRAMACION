package EjercicioEstructurasDeControl;
import java.util.Scanner;//Importamos Scanner para leer datos del usuario
//Ejercicio 1: Clasificación de edad
//Pide al usuario su edad e imprime si es menor de edad, adulto o adulto mayor.
//Este ejercicio lo he hecho sin mirar la solucion, con el resto si me he ayudado de las soluciones
public class MainEjercicioEstructurasDeControl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Creamos un objeto Scanner
//
//        System.out.println("Introduce tu edad: ");
//        int numero = scanner.nextInt();// Leemos el numero ingresado
//
//        //Estructura de seleccion if-else para verificar el numero
//        if(numero>=18 && numero<60){
//            System.out.println("Eres adulto");//Si el numero es mayor o igual que 18
//        }else if(numero>60){
//            System.out.println("Eres adulto mayor");//Si el numero es mayor o igual que 60
//        }else if(numero<18){
//            System.out.println("Eres menor de edad");//Si el numero es menor que 18
//        }
//        scanner.close();//Cerramos el scanner
//    }
//}

//Ejercicio 2: Contador de vocales
//Pide al usuario una palabra y cuenta cuántas vocales tiene.
//import java.util.Scanner;

        //Scanner scanner = new Scanner(System.in);

//        System.out.println("Introduce una palabra: ");
//        String palabra = scanner.nextLine().toLowerCase();//pasamos todo a minusculas
//
//        int contador = 0;
//        //recorremos la palabra con un for
//        for (int i = 0; i < palabra.length(); i++) {
//            char letra = palabra.charAt(i);
//            if ("aeiou".indexOf(letra) != -1) {// si la letra es una vocal
//                contador++;
//            }
//        }
//        System.out.println("Numero de vocales: " + contador);
//        scanner.close();
//    }
//}

//Ejercicio 3: Simulación de una calculadora
//Crea un menú que permita sumar, restar, multiplicar y dividir dos números ingresados por el usuario.
//        System.out.println("Menu: ");
//        System.out.println("1.Sumar");
//        System.out.println("2.Restar");
//        System.out.println("3.Multiplicar");
//        System.out.println("4.Dividir");
//        System.out.println("Elige una opcion: ");
//
//        int opcion = scanner.nextInt();
//        System.out.print("Ingresa el primer numero: ");
//        double num1 = scanner.nextDouble();//leemos la primera opcion del usuario
//        System.out.println("Ingresa el segundo numero: ");
//        double num2 = scanner.nextDouble();//leemos la segunda opcion del usuario
//
//        switch (opcion){ // Evaluamos la opción con switch
//            case 1:
//                System.out.println("Resultado: " + (num1 + num2));
//                break;
//            case 2:
//                System.out.println("Resultado: " + (num1 - num2));
//                break;
//            case 3:
//                System.out.println("Resultado: " + (num1 * num2));
//                break;
//            case 4:
//                System.out.println("Resultado: " + (num1 / num2));
//                break;
//            default:
//                System.out.println("Opcion no valida.");
//        }
//        scanner.close();
//    }
//}
//Ejercicio 4: Números pares hasta N
//Pide un número al usuario y muestra todos los números pares desde 1 hasta ese número.
//        System.out.println("Introduce un numero: ");
//        int n = scanner.nextInt();
//
//        for (int i = 2; i <= n; i += 2) { //+= es un operador de asignación compuesto, que se usa para sumar un valor a una
//            System.out.println(i + " "); // variable y luego asignar el resultado a esa misma variable. Es una forma
//        }                                // abreviada de escribir una operación de suma seguida de una asignación.
//        scanner.close();
//
//    }
//}
//Ejercicio 5: Contraseña con intentos limitados
//Pide al usuario una contraseña. Solo tiene 3 intentos antes de bloquearse.
        String contraseñaCorrecta = "Bali3";
        int intentos = 3;

        while (intentos > 0) {
            System.out.println("Ingresa la contraseña: ");
            String contraseña = scanner.nextLine();//captura la entrada del usuario como una cadena de texto y la almacena
                                                    // en la variable contraseña para poder usarla más tarde en el programa
                                                    // (como comparar con una contraseña correcta, como se ve en tu código).
            if (contraseña.equals(contraseñaCorrecta)) {
                System.out.println("Contraseña correcta");
                return;
            } else {
                intentos--;
                System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intentos");
                //Decrementa el valor de intentos: Cada vez que el usuario ingresa una contraseña incorrecta, el valor de intentos disminuye en 1.
                //La variable intentos se inicia con un valor de 3. Cada vez que el usuario ingresa una contraseña incorrecta,
                // el programa ejecuta intentos--, lo que reduce el número de intentos disponibles en 1. El ciclo while continuará
                // ejecutándose mientras queden intentos disponibles, es decir, mientras intentos > 0.
            }
        }
        System.out.println("Acceso bloqueado.");
        scanner.close();
    }
}

