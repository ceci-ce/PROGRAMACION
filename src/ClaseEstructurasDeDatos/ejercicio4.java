package ClaseEstructurasDeDatos;
import java.util.Scanner;

//4. Buscar un elemento
//Pide al usuario un número y muestra si está presente en un array, y en qué posición.

public class ejercicio4 {
    public static void main(String[] args) {
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
        entrada.close();
    }
}


