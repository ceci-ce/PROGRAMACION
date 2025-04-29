package ClaseEstructurasDeDatos;
import java.util.Scanner;
import java.util.Arrays;


import java.util.Scanner;

public class MainClaseEstructurasDeDatos {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int[] numeros = new int[5]; //Definimos el vector
//        int indice = 0;
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Introduce el numero" + (i+1) + ":");
//            numeros[i] = sc.nextInt();
//        }
//        System.out.println("CONTENIDO: ");
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Introduce el numero" + (i+1) + numeros[i]); //Para acceder a la posiciom del vector. Nombre del vector, [], indice. Se pone i para sacar todos los numeros
//        }
//
//        for (int  num: numeros){ //for each, mejor opccion
//            System.out.println("Elemento: + num");
//        }
//
//       while (indice < numeros.length){
//
//           System.out.println("Posicion"+ (indice+1) + ":" + numeros[indice]);
//
//           indice++;
//       }
//        Arrays.stream(numeros).forEach( num -> System.out.println("Elemento: " + num ) ); // Otra forma de hacer un foreach mas simple
//
//    }
//}
//4
        Scanner entrada = new Scanner(System.in);
        int[] numeros = {10, 25, 30, 16, 58};

        System.out.println("Introduce numero a buscar: ");
        int buscado = entrada.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] == buscado){
                System.out.println("El numero " + buscado + " esta en la posicion: " + (i + 1));
                encontrado = true;
                break;
            }
        }

        if (!encontrado){
            System.out.println("tu numero no está en la lista");
        }
    // ponerlo bien entrada.close();
    }
}

