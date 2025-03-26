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


