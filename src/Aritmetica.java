import java.util.Stack;

public class Aritmetica {
    public static void main(String[] args) {
        System.out.println(resultado("2 4 5 3 / * +"));
    }

    public static boolean esNumero (String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(0))) {
                return true;
            }
        } return false;
    }

    public static Stack<Integer> resultado (String cadena) {
        Stack<Integer> pila = new Stack<>();

        String[] separado = cadena.split(" ");
        int numero;
        int num1;
        int num2;

        for (int i = 0; i < separado.length; i++) {
            if (esNumero(separado[i])) {
                numero = Integer.parseInt("" + separado[i]);
                pila.push(numero);

            } else {
                num1 = pila.pop();
                num2 = pila.pop();

                if (separado[i].equals("/")) {
                    pila.push(num2 / num1);
                } else if (separado[i].equals("*")) {
                    pila.push(num2 * num1);
                } else if (separado[i].equals("+")) {
                    pila.push(num2 + num1);
                } else if (separado[i].equals("-")) {
                    pila.push(num2 - num1);
                }
            }
        } return pila;
    }
}
