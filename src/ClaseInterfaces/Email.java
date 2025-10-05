package ClaseInterfaces;

public class Email implements Enviable{

    //implements Enviable → Significa que Email “firma el contrato”:
    //debe implementar todos los métodos abstractos de Enviable → en este caso, enviar().

    private String direccion;

    public Email(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void enviar(String mensaje){
        System.out.println("Enviando email a " + this.direccion + " mensaje: " + mensaje);
    }
}
