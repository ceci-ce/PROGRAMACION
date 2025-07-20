package ClaseFunciones;

public class claseb {
  public static void main(String[] args){

    int[] numeros = {1,3,6,7,8};

    System.out.println("La media es: " + calcularMedia(numeros));

    String email = "pepe@gmail.com";

        String nombreUsuario = email.substring(0, email.indexOf("@"));
        System.out.println(nombreUsuario);

        String servidor = email.substring(email.indexOf("@") + 1);
        System.out.println(servidor);

    }

    public static double calcularMedia(int[] numeros){
        int suma = 0;
        for (int n: numeros){
            suma += n;
        }
        return (double) suma / numeros.length;
        }
}

