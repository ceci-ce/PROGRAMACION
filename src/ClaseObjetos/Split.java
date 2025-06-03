package ClaseObjetos;

public class Split {

    private boolean encendido;
    private String ubicacion;

    public Split(String ubicacion) {
        this.encendido = false;
        this.ubicacion = ubicacion;
    }

    public void encender() {
        if (!this.encendido) {
            this.encendido = true;
            System.out.println("Split de " + ubicacion + " encendido");
        }
    }
//revisar este codigo
    public void apagar() {
        if (this.encendido) {
            this.encendido = false;
            System.out.println("Split de " + ubicacion + " apagado");
        }
    }
}
