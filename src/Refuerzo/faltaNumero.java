package Refuerzo;

import java.util.Arrays;

public class faltaNumero {
    public static void main(String[] args) {
        int[] numeros = {4, 3, 6, 2};

        System.out.println(cualFalta(numeros));
    }

    public static int cualFalta (int[] numeros) {
        Arrays.sort(numeros);
        int cualFalta = 0;
        int siguiente;

        for (int i = 0; i < numeros.length - 1 ; i++) {
            siguiente = numeros[i + 1];

            if ((siguiente - numeros[i]) == 1) {
                cualFalta = -1;
            } else {
                cualFalta = numeros[i] + 1;
            }
        } return cualFalta;
    }
}
