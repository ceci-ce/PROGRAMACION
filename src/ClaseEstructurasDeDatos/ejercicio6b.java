package ClaseEstructurasDeDatos;
//6. Invertir un array
//Crea un programa que invierta los elementos de un array.
public class ejercicio6b {
    public static void main(String[] args) {

        int [] original2 = {21, 3, 26, 18};
        int [] invertido2 = new int[original2.length];

        for (int i = 0; i < original2.length; i++){
            invertido2[i] = original2[original2.length -1 - i];
        }
        System.out.println("El array invertido es: ");
        for (int num : invertido2){
            System.out.print(num + " ");
        }
    }
}
