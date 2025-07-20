package GestBanco;

import java.util.ArrayList;

public class Banco {

    private String nombre;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre){
        this.nombre = nombre;
        this.clientes = new ArrayList<>(); //Hay que dejar la lista inicializada
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
        System.out.println("Cliente añadido con éxito");
    }
    public Cliente buscarClientePorDNI(String dni){
        for(Cliente c: clientes){             //Se recorre el Cliente que es un objeto
            if(c.getDni().equals(dni)){
                return c;
            }
        }
        return null; //Si no se encuentra ningun cliente con DNI, devuelve null
    }

    public void mostrarTodosLosClientes(){
        for(Cliente c : clientes){
            c.mostrarInfo();
        }
    }

    public void transferir (String dniOrigen, String dniDestino, double cantidad){

        Cliente origen = buscarClientePorDNI(dniOrigen);
        Cliente destino = buscarClientePorDNI(dniDestino);

        if(origen != null && destino != null){

            if(origen.retirar(cantidad)){
                destino.depositar(cantidad);
                System.out.println("Transferencia realizada con éxito");
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Uno o ambos clientes no existen");
        }
    }
}
