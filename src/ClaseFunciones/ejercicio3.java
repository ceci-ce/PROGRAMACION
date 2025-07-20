package ClaseFunciones;

//3. Función que imprima un saludo personalizado
//Escribe una función saludar(String nombre, int edad) que imprima "Hola, [nombre], que bien
//llevas tus [edad] años".

public class ejercicio3 {
    public static void main(String[] args) {

    saludar("Ceci", 27);
    }

    public static void saludar(String nombre, int edad){
        System.out.println("Hola, " + nombre + ", qué bien llevas tus " + edad + " años.");
    }
}
