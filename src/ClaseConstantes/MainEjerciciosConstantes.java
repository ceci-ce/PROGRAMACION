package ClaseConstantes;

public class MainEjerciciosConstantes {
    public static void main(String[] args) {
        // CONSTANTES EN JAVA
/*  final double PI = 3.1416; // constante de tipo double
  final int EDAD_MAXIMA = 100; // constante de tipo entero

  System.out.println("El valor de PI es: " + PI);
  System.out.println("La edad máxima permitida es: " + EDAD_MAXIMA);

  // OPERADORES ARITMETICOS

  int a = 10, b = 5;
  System.out.println("Suma: " + (a + b));
  System.out.println("Resta: " + (a - b));
  System.out.println("Multiplicación: " + (a * b));
  System.out.println("División: " + (a / b));
  System.out.println("Módulo: " + (a % b));

  // OPERADORES RELACIONALES

  int x = 10, y = 20;
  System.out.println("¿x es igual a y? " + (x == y));
  System.out.println("¿x es diferente de y? " + (x != y));
  System.out.println("¿x es mayor que y? " + (x > y));
  System.out.println("¿x es menor que y? " + (x < y));

  // OPERADORES LOGICOS

  boolean c = true, d = false;
  System.out.println("c AND d: " + (c && d));
  System.out.println("c OR d: " + (c || d));
  System.out.println("NOT c: " + (!c));

  // EXPRESIONES Y EVALUACIONES

  int resultado = (10 + 5) * 2 / 3;
  System.out.println("El resultado de la expresión es: " + resultado); */

        // 🎓 Ejercicios prácticos 🏋️♂️

        // 1 Crea una constante llamada GRAVEDAD con el valor 9.81 y muestra su valor por pantalla.

        final float GRAVEDAD = 9.81f;
        System.out.println("La constante de gravitación de la tierra es de " + GRAVEDAD);

        // 2 Declara dos variables a = 25 y b = 7. Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.

        int a = 25;
        int b = 7;

        System.out.println("La suma de a mas b es igual a " +  (a + b));
        System.out.println("La resta de a menos b es igual a " + (a - b));
        System.out.println("La resta de b menos a es igual a " + (b - a));
        System.out.println("La multiplicación de a por b es igual a " + (a * b));
        System.out.println("La división de a entre b es igual a " + (a / b));
        System.out.println("El módulo de la división de a entre b es igual a " + (a % b));

        // 3 Declara una variable edad e imprime si la persona es mayor de edad (>= 18) o menor de edad (< 18).

        int edad = 21;

        System.out.println("Es la persona mayor de edad?" + (edad > 18));
        System.out.println("Es la persona menor de edad?" + (edad < 18));

        // 4 Crea un programa que reciba dos números y determine cuál es mayor, menor o si son iguales.

        int c = 9;
        int d = 11;

        System.out.println("Es c mayor que d?" + (c > d));
        System.out.println("Es d mayor que c?" + (d > c));
        System.out.println("Son c y d iguales?" + (c == d));
        System.out.println("Son c y d distintas?" + (c != d));

        // 5 Escribe un programa que evalúe la siguiente expresión lógica: (5 > 3) && (10 < 20). ¿Cuál es el resultado?

        int numero1 = 5;
        int numero2 = 3;
        int numero3 = 10;
        int numero4 = 20;

        System.out.println(numero1 > numero2 && numero3 < numero4);

        // 6 Modifica el programa anterior y evalúa también (5 > 3) || (10 > 20). Explica los resultados obtenidos.

        System.out.println(numero1 > numero2 || numero3 < numero4);

        // 7 Declara tres variables x = 10, y = 20, z = 30. Compara x + y con z utilizando operadores relacionales.

        int x = 10;
        int y = 20;
        int z = 30;

        System.out.println("¿Es la suma de x mas y igual a z?: " + ((x + y) == z));

        // 8 Crea un programa que pida al usuario dos números y evalúe si son múltiplos (num1 % num2 == 0).

        int num1 = 4;
        int num2 = 2;

        System.out.println("¿El num1 y el num2 son múltiplos?: " + (num1 % num2 == 0));

        // 9 Escribe un código que reciba un número e indique si es par o impar usando el operador módulo (%).

        int num3 = 5;
        int num4 = 3;

        System.out.println("¿Es el número 5 par o impar?: " + (num3 % num4 == 0));

        // 10 Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro). Convierte una cantidad de dólares ingresada por el usuario a euros.

        final float TASA_CAMBIO = 1.12f;
        int cambio = 645;

        System.out.println("¿Cuántos euros son 645 dólares?: " + (cambio * TASA_CAMBIO)+ " €");
    }
}
