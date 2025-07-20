package ClaseFunciones;

//5. Función que sume los elementos de un array
//Crea una función que reciba un array de enteros y devuelva la suma de sus elementos.
//Ejemplo esperado:
//int[] numeros = {4, 2, 7, 1};
//int suma = sumarArray(numeros); // Resultado: 14

public class ejercicio5 {
    public static void main(String[] args) {

        int [] numeros = {3,6,9,1,4};
        int suma = sumaEnteros(numeros);
        System.out.println("La suma del array es: " + suma);
    }

    public static int sumaEnteros(int[] array){
        int suma = 0;
        for(int n: array){
            suma += n;
        }
        return suma;
    }
}
