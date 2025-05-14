package ClaseEstructurasDeDatos;

//6. Invertir un array
//Crea un programa que invierta los elementos de un array. Por ejemplo, si el array es
// {1, 2, 3, 4, 5}, el resultado debe ser {5, 4, 3, 2, 1}.
public class ejercicio6 {
    public static void main(String[] args) {

        int [] original = {1, 2, 3, 4, 5};
        int [] invertido = new int[original.length];

        //Copiar los elementos en orden inverso

        for (int i = 0; i < original.length; i ++){
            invertido[i] = original[original.length -1 -i];
        }

        //Mostrar resultado

        System.out.println("Array invertido: ");
        for (int num : invertido) {
            System.out.println(num + " ");
        }
    }
}

/* EXPLICACION
- int[] → Indica que invertido es un array de enteros.
- new int[...] → Usamos la palabra clave new para crear un nuevo array de tipo int.
- original.length → Especifica el tamaño del nuevo array. Usamos la propiedad .length del array original para asegurarnos
de que tengan la misma cantidad de elementos.

int[] invertido = new int[5]; Se crea un array con 5 posiciones y todos los valores son 0 por defecto. Luego, el
bucle for del ejercicio se encarga de reemplazar esos ceros con los números invertidos del array original.

Se llena el array invertido desde el final del array original hacia el principio.

original.length - 1 es el último índice del array. Se usa eso siempre para acceder al ultimo elemento del array

Restamos i para ir desde el final al principio.

Se muestran los numeros del array invertido con un for-each: "Para cada elemento num dentro del array invertido,
 haz lo siguiente..."
 */