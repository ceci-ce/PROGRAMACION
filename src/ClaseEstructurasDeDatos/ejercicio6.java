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
