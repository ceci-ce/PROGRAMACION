package ClaseEstructurasDeDatos;

//10. Frecuencia de elementos
//Dado un array de enteros, muestra cuántas veces se repite cada valor.
//Ejemplo: {1, 2, 2, 3, 1, 1} →
//1 aparece 3 veces
//2 aparece 2 veces
//3 aparece 1 vez

public class ejercicio10 {
    public static void main(String[] args) {

        int[] enteros = {1, 2, 2, 3, 1, 1};
        int[] unicos = new int[enteros.length]; // guarda los números que ya has contado.
        int[] contador = new int[enteros.length]; // guarda cuántas veces se repite cada número de unicos[].
        int numUnicos = 0; // te ayuda a saber cuántos elementos únicos has guardado hasta ahora (sirve como índice).


        for (int i = 0; i < enteros.length; i++) { //Recorremos cada número del array enteros.
            boolean yaContado = false;     // Creamos una variable yaContado para saber si ese número ya lo hemos contado antes.

            //Comprobamos si ya fue contado
            for (int j = 0; j < numUnicos; j++) { //Recorremos el array unicos[].
                if (enteros[i] == enteros[j]) { //Si el número actual (enteros[i]) ya está en unicos[j]:
                    contador[j]++; //Aumentamos el contador correspondiente
                    yaContado = true; //Marcamos yaContado = true.
                    break; //Salimos del bucle (break) porque ya encontramos ese número.
                }
            }// Si es la primera vez que aparece
            if (!yaContado) { //Si no estaba en unicos[]:
                unicos[numUnicos] = enteros[i]; //Lo agregamos como nuevo número único
                contador[numUnicos] = 1; //Le damos un contador de 1 xk acaba de aparecer por primera vez, así que lo contamos una vez
                numUnicos++;//Aumentamos el contador numUnicos para seguir guardando bien los siguientes.
            }
        }
        // Mostrar resultados
        for (int i = 0; i < numUnicos; i++) {
            System.out.println(unicos[i] + " aparece " + contador[i] + " veces");
        }
    }
}
