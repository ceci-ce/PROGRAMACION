package Ejercicio3Herencia;

public class Revista extends Recurso{

    private int numeroEdicion;

    // Constructor de revista

    public Revista(String titulo, String autor, int numeroEdicion){
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + " .Autor: " + autor + " .Número de edicion: " + numeroEdicion);
    }
}
