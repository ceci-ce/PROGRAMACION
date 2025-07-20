package GestBanco;

public class Cliente {

    // atributos de la clase cliente
    private String nombre;
    private String dni;
    private double saldo;

    // Atajo: clic derecho --> generate --> constructor //los constructores tienen que ser siempre publicos
    public Cliente(String dni, String nombre, double saldo) {
        this.saldo = saldo;
        this.dni = dni;
        this.nombre = nombre;
    }

    // estos metodos sirven para que desde fuera se pueda acceder a los atributos privados
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    // se crea la funcion depositar
    public void depositar (double cantidad){
        this.saldo += cantidad;
    }

    //REVISAR CODIGO
    // se crea la funcion de retirar. Si no hay saldo suficiente no se se puede retirar, por eso se usa el boolean
    public boolean retirar (double cantidad){
        if(saldo >= cantidad){
            this.saldo -= cantidad;
            boolean True;
        }
            return false;
        }
        public void mostrarInfo(){
            System.out.println("\n DNI: " + this.dni + "\n nombre: " + this.nombre + "\n Saldo:");
        }

    }


