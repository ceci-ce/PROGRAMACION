package Ejercicio6Interfaces;

public abstract class Producto implements Vendible{

    protected String nombre;
    protected double precioBase;

    public Producto(String nombre, double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre(){
        return nombre;
    }

    // Metodo abstracto que cada tipo de producto implementará de forma diferente
    public abstract double calcularPrecioFinal();

    // Todas las clases heredan esto gracias a la interfaz
    @Override
    public double calcularImporte(){
        return calcularPrecioFinal();
    }
}
