package ClaseMapas;

import java.util.HashMap;
import java.util.Map;


import java.util.HashMap;

public class clase {
    public static void main(String[] args) {

        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Ana", 8.5);
        notas.put("Anita", 7.0);
        notas.put("Jose", 6.5);
        notas.put("Joselito", 9.0);

        for(Map.Entry<String, Double> entrada: notas.entrySet()){
            System.out.println(entrada.getKey() + "->" + entrada.getValue());
        }
    }
}
