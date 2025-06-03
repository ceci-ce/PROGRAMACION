package ClaseObjetos;

import java.util.ArrayList;

public class Termostato {
    private double temperaturaDeseada;
    private Termometro termometro;
    private ArrayList<Split> splits;

    //Declarar el constructor
    public Termostato(double temperaturaDeseada, Termometro termometro){
        this.temperaturaDeseada = temperaturaDeseada;
        this.termometro = termometro;
        this.splits = new ArrayList<>();
    }

    public void añadirSplit(Split split){
        this.splits.add(split);
    }

    public void comprobarTemperatura(){
        double tActual = termometro.leerTemperatura(); //dentro del objeto termometro hemos comprobado la temperatura

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
