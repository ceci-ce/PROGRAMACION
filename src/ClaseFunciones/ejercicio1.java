package ClaseFunciones;

//1. Crear una función que calcule el doble de un número
//Crea una función llamada doble que reciba un número entero y devuelva su doble.
//Ejemplo esperado:
//int resultado = doble(4); // resultado = 8

public class ejercicio1 {
    public static void main(String[] args) {

        int resultadoDoble = doble(4);
        System.out.println("El doble de 4 es " + resultadoDoble);
    }

        // funcion que calcula el doble de un numero

        public static int doble(int numero){
            return numero * 2;
        }
    }
