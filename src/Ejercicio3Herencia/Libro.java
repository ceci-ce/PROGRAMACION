package Ejercicio3Herencia;

public class Libro extends Recurso{

    private int numeroPaginas;

    // Constructor de libro

    public Libro(String titulo, String autor, int numeroPaginas){
        super(titulo,autor);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + " .Autor: " + autor + " .NÚmero de páginas: " + numeroPaginas);
    }
}
