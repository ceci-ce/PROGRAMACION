package ClaseConversionesDeTipo;

public class MainClaseConversiones {
    public static void main(String[] args) {
//1. Conversion implicita de int a double
        // Declaramos una variable entera
//        int numeroEntero = 25;
//        double numeroDecimal = numeroEntero;
//
//        System.out.println("Número entero: " + numeroEntero);
//        System.out.println("Número convertido a double: " + numeroDecimal);
//    }
//}

//2.Conversión explícita (double a int) con truncamiento
        //Declaramos una variable double con un calor decimal

//        double valorDecimal = 8.75;
//
//        //Conversion explicita (casting) de double a int
//        //Se usa int antes de la variable para reforzar la conversion
//        int valorEntero = (int) valorDecimal; //Los decimales se eliminarán
//
//        //Imprimimos los valores originales y convertidos
//        System.out.println("Valor original (double): " + valorDecimal);
//        System.out.println("Valor convertido (int): " + valorEntero);
//    }
//}

//3. Desbordamiento al convertir int a byte

        //Número mayor al rango de byte (-128 a 127)
//    int numeroGrande = 150;
//
//    //Conversión explícita a byte
//    //Como 150 está fuera del rango de byte, se producirá un desbordamiento
//
//    byte numeroPequeño = (byte)numeroGrande;
//        // Mostramos los valores
//        System.out.println("Número original (int): " + numeroGrande);
//        System.out.println("Número convertido a byte: " + numeroPequeño);
//    }
//}
//El número 150 excede el rango de byte (-128 a 127).
//Java lo ajusta de forma cíclica, resultando en -106.

//4. Conversión de char a int (Código ASCII)
        //Declaramos un carácter
//        char letra = 'C';
//
//        //Conversión implícita de char a int
//        //Java convierte 'C' a su código ASCII (67)
//
//        int codigoASCII = letra;
//
//        System.out.println(letra);
//        System.out.println(codigoASCII);
//    }
//}
        //Cada carácter en Java tiene un código ASCII asociado.
        //'A' se convierte en 65 automáticamente.

//5. Conversión de String a int con Integer.parseInt()
        //Declaramos una cadena con un número en formato texto

//        String texto = "123";
//
//        //Convertimos la cadena a un número entero
//
//        int numero = Integer.parseInt(texto);
//
//        System.out.println(texto);
//        System.out.println(numero);
//        ;
//    }
//}

//⚠ Precaución:
// Si intentamos convertir "abc" a int, el programa lanzará un error.

//6. Conversión de int a String

//        int número = 226;
//
//        Convertimos el número a String
//
//        String texto = String.valueOf(número);
//
//        System.out.println(número);
//        System.out.println(texto);
//    }
//}