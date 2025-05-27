package ClaseFunciones;

public class clase {
    public static void main(String[] args) {

        String name = "Maria";

        saludar();

        saludar(name);
        saludar("Juan");
        System.out.println(saluda2(name));

        System.out.println(sumar(5,7));

        System.out.println(sumar(4,9,5,2));

        if(esPar(3)){
            System.out.println("Es par");
        }else{
            System.out.println("No es par");
        }
    }

    //1. Imprime un saludo
    public static void saludar(){
        System.out.println("Hola");
    }

    public static void saludar(String nombre){
        System.out.println("Hola, " + nombre + "!");
    }

    public static String saluda2(String nombre){
        return ("Hola, " + nombre + "!");
    }

    // Suma solo dos numeros
    public static int sumar(int n1, int n2){
        return n1 + n2;
    }

    // Funcion que devuelve un boolean
    public static boolean esPar (int n1){
        if(n1 % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    // Si no se cuantos numeros voy a sumar, se hace con un array (numeros es un array)
    public static int sumar(int... numeros) {

        int suma = 0;

        // Se recorre el array con un for each
        for (int n: numeros){
            suma += n;
    }

        return suma;

    }

}
