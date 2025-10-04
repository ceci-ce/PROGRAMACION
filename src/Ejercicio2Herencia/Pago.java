package Ejercicio2Herencia;

public abstract class Pago {

    protected double cantidad; //protected permite acceso desde la clase y sus subclases (y otras clases del mismo paquete)

    public Pago (double cantidad){
        if (cantidad <=0){
            throw new IllegalArgumentException("La cantidad debe de ser mayor que cero");
        }

        this.cantidad = cantidad;
    }

    public abstract void procesarPago(); // los metodos abstractos donde estan declarados (en este caso es el padre) no se implementa nada dentro,xk se va a implementar despues (en los hijos)

    public void mostrarCantidad(){
        System.out.println("Cantidad: " + this.cantidad);
    }
}
