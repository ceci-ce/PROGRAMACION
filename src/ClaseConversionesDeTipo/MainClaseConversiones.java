//package ClaseConversionesDeTipo;
//
//public class MainClaseConversiones {
//    public static void main(String[] args) {
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

//7. Conversión de double a String

//        double precio = 99.99;
//
//        Conversion a String
//        String textoPrecio = Double.toString(precio);
//
//        System.out.println(textoPrecio);
//    }
//}

//8. Conversion de boolean a String

//        boolean activo = true;
//
//         Conversion a String
//
//        String estado = String.valueOf(activo);
//
//        System.out.println(estado);
//    }
//}

//9. Conversion en operaciones matemáticas

//        int a = 5;
//        int b = 2;

        //Division sin conversion (se pìerde el decimal)
       // System.out.println("Division entera: " + 5 / 2);

//        Conversion a double para obtener decimales
//        double resultado = (double) a / b;
//        System.out.println("Division con casting: " + resultado);
//    }
//}
    //💡 Explicación:
        // Sin conversión, la división entre enteros descarta los decimales.

//10.  Conversión de long a int y de float a int

//🔹 Objetivo: Ver cómo se pueden convertir tipos numéricos más grandes en más pequeños usando casting.

        // Declaramos un número de tipo long (entero largo)
//        long numeroLargo = 1_000_000_000L; // 1,000 millones
//
//        // Convertimos de long a int (puede haber pérdida si el número es muy grande)
//        int numeroEntero = (int) numeroLargo;
//
//        // Declaramos un número float con decimales
//        float numeroDecimal = 9.99f;
//
//        // Convertimos de float a int (se perderán los decimales)
//        int numeroSinDecimales = (int) numeroDecimal;
//
//        // Imprimimos los valores antes y después de la conversión
//        System.out.println("Número original (long): " + numeroLargo);
//        System.out.println("Número convertido a int: " + numeroEntero);
//        System.out.println("Número original (float): " + numeroDecimal);
//        System.out.println("Número convertido a int (sin decimales): " + numeroSinDecimales);
//    }
//}
    //⚠ Explicación:
        //long → int: No hay problema en este caso, pero si el número fuera mayor a 2,147,483,647, podría desbordarse.
        //float → int: Se eliminan los decimales porque int no los puede almacenar.



