package ClaseMapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio4b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> productos = new HashMap<>();

        productos.put("Fresas", 14);
        productos.put("Tomates", 8);
        productos.put("Cebollas", 3);
        productos.put("Atun", 2);
        productos.put("Guacamole", 2);
        productos.put("Nachos", 1);

        System.out.println("Introduce el producto a actualizar: ");

        String productoUsuario = scanner.nextLine().trim();

        if(productos.containsKey(productoUsuario)){
            System.out.println("Introduce la nueva cantidad: ");
            int nuevaCantidad = scanner.nextInt();
            productos.put(productoUsuario, nuevaCantidad);
            System.out.println("Cantidad actualizada");
        }else{
            System.out.println("Producto no encontrado");
        }

        System.out.println("Lista actualizada: ");
        for(Map.Entry<String, Integer> entry: productos.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        scanner.nextLine(); // Limpiar el buffer

    }
    }
