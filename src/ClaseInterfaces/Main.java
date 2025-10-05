package ClaseInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Enviable> servicios = new ArrayList<>(); //Creamos una lista que puede guardar cualquier objeto que implemente Enviable,sin importar su clase concreta (Email, SMS, etc.).
        servicios.add(new Email("cliente@pepe.com")); //Añadimos un objeto Email
        servicios.add(new SMS("+34165434")); //Añadimos un objeto SMS

        for (Enviable e: servicios){
            e.enviar("Su pedido ha sido enviado");
            e.confirmar();
        }
    }
}
