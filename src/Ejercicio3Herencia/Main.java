package Ejercicio3Herencia;

public class Main {
    public static void main(String[] args){

        Recurso recurso1 = new Libro("El verano que me enamoré", "Jenny Han", 120);
        Recurso recurso2 = new Revista("Las virgenes del paraiso", "Barbara Bood", 3);

        Recurso[] recursos = {recurso1, recurso2};

        for (Recurso r: recursos){
            r.mostrarInfo();
        }
    }
}
