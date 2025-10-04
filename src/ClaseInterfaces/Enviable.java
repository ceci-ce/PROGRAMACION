package ClaseInterfaces;

public interface Enviable {

    // las interfaces no necesitan un constructor

    void enviar(String mensaje);

    default void confirmar() {
        System.out.println("Mensaje enviado correctamente");
    }
}
