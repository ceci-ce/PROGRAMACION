package ClaseFunciones;

//7. Función que calcule la media de 3 números
//Crea una función media(double a, double b, double c) que devuelva el promedio de los tres
//valores.

public class ejercicio7 {
    public static void main(String[] args) {

        double media = calcularMedia3(2.4,4.9,8.1);
        System.out.printf("La media es: %.2f%n" , media);
    }

    public static double calcularMedia3(double a, double b, double c){
        return (a + b + c)/3;
    }
}
