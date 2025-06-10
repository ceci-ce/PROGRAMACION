package ClaseObjetos;

import java.util.ArrayList;

public class Termostato {
    private double temperaturaDeseada;
    private Termometro termometro;
    private ArrayList<Split> splits;

    //Declarar el constructor
    public Termostato(double tD, Termometro t){
        this.temperaturaDeseada = tD;
        this.termometro = t;
        this.splits = new ArrayList<>();
    }

    public void añadirSplit(Split s){
        this.splits.add(s);
    }

    public void comprobarTemperatura(){
        double tActual = termometro.leerTemperatura(); //dentro del objeto termometro hemos comprobado la temperatura
        System.out.println("Temperatura actual: " + tActual + " Temperatura deseada: " + this.temperaturaDeseada);

        if( tActual > this.temperaturaDeseada){
            for (Split s: splits) { //si la t actual es mayor que la deseada quiero recorrer los splits y encenderlos
                s.encender();
            }
        }else{
            for(Split s : splits){
                s.apagar();
            }
        }
    }

}
