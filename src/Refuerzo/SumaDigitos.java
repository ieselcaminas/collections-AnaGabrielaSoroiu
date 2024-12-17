package Refuerzo;

public class SumaDigitos {
    public static void main(String[] args) {
        String digitos = "5143";

        resultado(digitos);
    }

    public static String sumaDigitos(String digitos) {
        int suma = 0;

        for (int i = 0; i < digitos.length(); i++) {
            int num = Integer.parseInt(digitos.charAt(i) + "");

            if (num >= 0) {
                suma += num;
            }
        } return String.valueOf(suma);
    }

    public static void resultado (String digitos) {

        for (int i = 0; i < digitos.length(); i++) {
            System.out.print(digitos.charAt(i));

            if (i < digitos.length() - 1) {
                System.out.print(" + ");
            } else {
                System.out.print(" = " + sumaDigitos(digitos));
            }
        }
    }
}
