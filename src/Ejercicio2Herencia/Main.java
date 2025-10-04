package Ejercicio2Herencia;

public class Main {

    public static void main(String[] args) {

        //pago1 y pago2 son referencias a objetos que deben ser (o heredar de) Pago
        //Esto es polimorfismo: una variable de tipo padre puede apuntar a un objeto de tipo hijo

        Pago pago1 = new PagoTarjeta(150, "12354-5431-51351-1513");
        Pago pago2 = new Paypal(300, "cliente@correo.es");

        /*Lado derecho (new PagoTarjeta(...))
        Aquí estás creando un objeto de la clase PagoTarjeta.
        Llamar a new PagoTarjeta(150, "12354-...") ejecuta el constructor de esa clase.
        En Java, al crear un objeto de una subclase:
        Primero se ejecuta el constructor del padre (Pago), usando super(...).
        Luego se ejecuta el constructor del hijo (PagoTarjeta), para inicializar lo propio de esa clase.

1️⃣ Reserva espacio en memoria para el objeto PagoTarjeta.
2️⃣ Llama al constructor de PagoTarjeta.
3️⃣ PagoTarjeta dentro llama a super(cantidad).
4️⃣ Se ejecuta el constructor de Pago.
5️⃣ Vuelve al constructor de PagoTarjeta, que inicializa numTarjeta.
6️⃣ Devuelve la referencia del objeto recién creado.

        Resultado final
        En memoria tienes un objeto PagoTarjeta que contiene:
        El atributo heredado cantidad (definido en Pago).
        El atributo propio numTarjeta (definido en PagoTarjeta).
        Y la variable pago1 (tipo Pago) apunta a ese objeto.*/

        Pago[] pagos = {pago1, pago2}; //Crea un array de referencias a Pago

        for (Pago p: pagos){
            p.procesarPago();
            p.mostrarCantidad();

            /*Llamada a método sobre la referencia p
            Java decide en tiempo de ejecución qué implementación ejecutar según la clase real del objeto:
           - Si p apunta a PagoTarjeta se ejecuta PagoTarjeta.procesarPago().
           - Si p apunta a Paypal se ejecuta Paypal.procesarPago().
            Esto funciona porque procesarPago() es (en tu diseño) un método abstracto en Pago que las subclases implementan así cada tipo tiene su lógica propia
             */
        }
    }
}
