package Refuerzo;

import java.util.HashMap;
import java.util.Map;

public class Moda {
    public static void main(String[] args) {
        int[] numeros = {10, 25, 0, 5, 10, 10, 10, 1, 0};

        System.out.println(moda(numeros));
    }

    public static int moda (int[] numeros) {
        Map<Integer, Integer> moda = new HashMap<>();
        int max = 0;
        int modas = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (!moda.containsKey(numeros[i])) {
                moda.put(numeros[i], 1);
            } else {
                moda.put(numeros[i],moda.get(numeros[i]) + 1);
            }
        } 
        
        for (Map.Entry<Integer, Integer> mayor : moda.entrySet()) {
            if (mayor.getValue() > max) {
                max = mayor.getKey();
                modas = mayor.getKey();
            }
        } return modas;
    }
}
