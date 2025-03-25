package ClaseEstructurasDeControl;
import java.util.Scanner;//sin esto no vas a pedirle al usuario dato alguno
public class MainClaseEstructurasDeControl {
    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
//            System.out.println("Dame un numero:");
//        int numero = scanner.nextInt();//con esto, leo el numero del usuario
//
//        //Estructura del if-else
//        if(numero>0){
//            System.out.println("El numero es positivo");
//        } else if (numero<0) {
//            System.out.println("El numero es negativo");
//        } else {
//            System.out.println("El numero es cero");
//        }
//        scanner.close();//Cierra el scanner.

//Creame un menu interactivo donde el usuario elija una opcion y muestre un mensaje

//Scanner scanner = new Scanner(System.in);
//
//Menu de opciones
//        System.out.println("*Menu de opciones");
//        System.out.println("1.Saludar");
//        System.out.println("2.Mensaje motivacionial");
//        System.out.println("3.Salir");
//
//        System.out.println("Selecciona una opcion");
//        int opcion = scanner.nextInt();//Leemos la opcion del usuario
//
//       //Evaluar opciones con el swith
//       swith(opcion);{
//            case 1:
//                System.out.println("Hola,bienvenido");
//                break;
//            case 2:
//                System.out.println("Bro, esto es masivo");
//                break;
//            case 3:
//                System.out.println("Saliendo del programa");
//                break;
//            default:
//                System.out.println("Macho,me has dado algo que no entiendo");
//
//        }
//        scanner.close();

// Imprimir los numero del 1 al 10 con un for
//Usar un buvle para contar del 1 al 10
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Numero: " + i);
//            //Asi muestro cada interaccion
//        }

//Ejercicio 4
        //Usa el while para pedir numeros hasta que ponga 0
//    Scanner scanner = new Scanner(System.in);
//    int numero;
//
//        System.out.println("Dame un numero y pon 0 para salir");
//        numero = scanner.nextInt();
//
//        //Mientras que el numero no sea 0,sigue pidiendo
//        while(numero!=0){
//            System.out.println("Has introducido: " + numero);
//            System.out.println("Introduce otro numero.");
//            numero = scanner.nextInt();
//        }
//        System.out.println("Programa finalizado.");
//        scanner.close();

//Ejercicio 5
        //Pide contraseña y que no pueda entrar el usuario hasta que ponga java123
        Scanner scanner = new Scanner(System.in);
        String password;

        //Bucle do-while
        do{
            System.out.println("Introduce tu contraseña:");
            password = scanner.nextLine();
        }while(!password.equals("java123"));

        System.out.println("Acceso concedido");
        scanner.close();

    }
}
