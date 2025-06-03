package ClaseObjetos;

public class Termometro {

    //Declarar los atributos

    private double temperaturaActual;

    public Termometro(){
        this.temperaturaActual = 25.0;
    }
    public double leerTemperatura(){
        this.temperaturaActual += (Math.random() * 2 - 1); //Se pone -1 xk math.random genera numeros de 0 a 1 y queremos que vaya del -1 al 1
        return this.temperaturaActual;
    }
}
