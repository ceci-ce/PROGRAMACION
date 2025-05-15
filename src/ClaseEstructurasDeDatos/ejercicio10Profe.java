package ClaseEstructurasDeDatos;

public class ejercicio10Profe {
    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 1, 1};
        boolean[] contado = new boolean[array.length]; // Para marcar los ya contados

        for (int i = 0; i < array.length; i++) {
            if (!contado[i]) {
                int contador = 1;

                // Comparar con el resto del array
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        contador++;
                        contado[j] = true; // Marcar como contado
                    }
                }

                // Mostrar resultado
                System.out.println(array[i] + " aparece " + contador + " veces");
            }
        }
    }
}
