package ClaseFunciones;

//2. Función que indique si un número es par
//Crea una función esPar(int n) que devuelva true si el número es par y false en caso contrario.
//Prueba la función en el main.

public class ejercicio2 {
    public static void main(String[] args) {

        if(esPar(3)){
            System.out.println("Es par");
        }else{
            System.out.println("No es par");
        }
    }

    public static boolean esPar(int n1){
        if(n1 % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
