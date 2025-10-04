package Ejercicio2Herencia;

public class PagoTarjeta extends Pago {

    private String numTarjeta;

    //cuando creas un hijo, si su padre tiene un constructor hay que llamarlo antes de nada, no se puede crear al hijo sin crear al padre
    //mediante la palabra super y enviandole los datos que necesite(cantidad y numero tarjeta)

    public PagoTarjeta (double cantidad, String numTarjeta){
        super(cantidad); // inicializa la parte del padre
        this.numTarjeta = numTarjeta;
    }

    //El padre declara procesarPago() como abstracto para forzar que cada tipo de pago tenga su propia implementación.
    @Override
    public void procesarPago(){
        System.out.println("Procesar pago con tarjeta: " + this.numTarjeta + " cantidad: " + this.cantidad);
    }
}
