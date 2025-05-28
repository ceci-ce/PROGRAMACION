package ClaseListaDeListas;

import java.util.Scanner;
import java.util.ArrayList;

//4. Modificar un Elemento en una Lista Interna:
//
//Crea un ArrayList<ArrayList<String>> con listas internas representando productos y sus precios.
//Permite modificar el precio de un producto y luego imprime la lista de productos actualizada.

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Object>> stock = new ArrayList<>();

        ArrayList<Object> producto1 = new ArrayList<>();
        producto1.add("Teclado");
        producto1.add(25.0);
        stock.add(producto1);

        ArrayList<Object> producto2 = new ArrayList<>();
        producto2.add("Pantalla");
        producto2.add(60.0);
        stock.add(producto2);

        ArrayList<Object> producto3 = new ArrayList<>();
        producto3.add("Cargador");
        producto3.add(15.0);
        stock.add(producto3);

        System.out.print("Introduce el nombre del producto a modificar: ");
        String productoABuscar = sc.nextLine().trim();

        boolean modificado = false;
        for (ArrayList<Object> producto : stock) {
            if (producto.get(0).equals(productoABuscar)) {
                System.out.print("Introduce el nuevo precio: ");
                String precioStr = sc.nextLine().trim();
                double nuevoPrecio = Double.parseDouble(precioStr);
                producto.set(1, nuevoPrecio);
                modificado = true;
                break;
            }
        }

        if (!modificado) {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("Lista actualizada de productos:");
        for (ArrayList<Object> producto : stock) {
            System.out.println(" - " + producto.get(0) + ": " + producto.get(1) + "€");
        }
    }
}

