package ClaseEstructurasDeDatos;
//8. Rotar elementos
//Escribe un programa que rote los elementos de un array una posición hacia la derecha.
//Ejemplo: {1, 2, 3, 4, 5} → {5, 1, 2, 3, 4}.

public class ejercicio8 {
    public static void main(String[] args) {

        // Guardar el ultimo elemento
        int [] array = {1, 2, 3, 4, 5};
        int ultimo = array[array.length - 1];

        // Desplazar hacia la derecha
        for (int i = array.length - 1;i > 0; i--){
            array[i] = array[i -1]; //Está desplazando los elementos del array una posición a la derecha, copiando el valor de la posición anterior:
        }
        // Poner el ultimo a la derecha
         array[0] = ultimo;

        // Mostrar resultado
        System.out.println("Array rotado: ");
        for (int num : array){
        System.out.print(num + " ");
        }
    }
}

/* EXPLICACION
1. int i = array.length - 1;
Esto inicializa la variable i con el índice del último elemento del array.

array.length te da el número total de elementos del array.

array.length - 1 es el índice del último elemento (porque en Java los índices empiezan en 0).

2. i > 0;
Esta es la condición para que el bucle siga ejecutándose.

El bucle se detiene cuando i ya no es mayor que 0, o sea, cuando i llega a 1.

No incluye el índice 0 porque ahí vamos a poner el valor guardado previamente (ultimo).

3. i--
Esto significa decrementar i en 1 en cada vuelta del bucle.

Va de derecha a izquierda: 4 → 3 → 2 → 1
 */