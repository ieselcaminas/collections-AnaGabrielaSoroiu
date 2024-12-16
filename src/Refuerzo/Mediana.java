package Refuerzo;

public class Mediana {
    public static void main(String[] args) {
        double[] numeros = {1, 2, 6, 17, 18};

        System.out.println(mediana(numeros));
    }

    public static double mediana (double[] numeros) {
        double mediana;
        int contador = 0;

        if (numeros.length % 2 == 0) {
            for (int i = 0; i < numeros.length; i++) {
                contador++;
            }
            mediana = (numeros[contador/ 2] + numeros[(contador - 1) / 2]) / 2;

        } else {
            for (int i = 0; i < numeros.length; i++) {
                contador++;
            }
            mediana = numeros[contador / 2];
        } return mediana;
    }
}
