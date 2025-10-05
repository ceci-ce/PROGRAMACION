package Ejercicio6Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vendible> productos = new ArrayList<>();

        productos.add(new ProductoDigital("Tablet", 555.0, 15.0));
        productos.add(new ProductoFisico("Libro", 20, 5));


        // recorremos la lista
        for(Vendible v: productos){

            // verificamos si el objeto implementa o hereda de Producto

            if(v instanceof Producto){

            // Hacemos un casting para poder acceder al nombre del producto. El casting significa decirle al programa que trate un objeto como si fuera de otro tipo compatible
            Producto p = (Producto) v;
            System.out.println(p.getNombre() + " → " + p.calcularImporte() + "€");
            }else{
                System.out.println("Objeto no es un Producto");
                }
            }
        /*Qué hace esa línea:
        (Producto) → le dices a Java “trata el objeto v como si fuera de tipo Producto”.
        p.getNombre() → ahora sí puedes acceder a los métodos de la clase Producto.*/
        }
    }