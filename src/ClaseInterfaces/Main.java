package ClaseInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Enviable> servicios = new ArrayList<>();
        servicios.add(new Email("cliente@pepe.com"));
        servicios.add(new SMS("+34165434"));

        for (Enviable e: servicios){
            e.enviar("Su pedido ha sido enviado");
            e.confirmar();
        }
    }
}
