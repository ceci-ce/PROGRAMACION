package GestBanco;

public class Main {
    public static void main(String[] args) {

        Banco miBanco = new Banco("Mi Banco");

        Cliente c1 = new Cliente("Pepe Perez", "444444A", 15000.0);
        Cliente c2 = new Cliente("Maria Perez", "444444B", 800.0);

        miBanco.agregarCliente(c1);
        miBanco.agregarCliente(c2);

        miBanco.mostrarTodosLosClientes();

        miBanco.transferir("44444444A","44444444B", 200.0 );

        miBanco.mostrarTodosLosClientes();
    }
}
