package Ejercicio3Herencia;

public abstract class Recurso { // Es abstracta porque solo sirve como base (no se crean recursos "genéricos")

    protected String titulo; //protected → permite que los hijos accedan a estos atributos directamente (this.titulo)
    protected String autor;

    // Constructor

    public Recurso(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Metodo abstracto: cada subclase lo implementará de su forma

    public abstract void mostrarInfo(); //cada hijo tendrá que implementar su propia versión de este metodo
}
