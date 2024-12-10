import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        System.out.println(esParentesis("}("));
    }

    public static boolean esParentesis(String cadena) {
        Stack<Character> cadaParentesis = new Stack<>();
        char character;
        char ultimo;

        for (int i = 0; i < cadena.length(); i++) {
            character = cadena.charAt(i);

            if (character == '(' || character == '{' ||character == '[') {
                cadaParentesis.push(character);

            } else if (character == ')') {
                if (cadaParentesis.isEmpty()) {
                    return false;
                }
                ultimo = cadaParentesis.pop();

                if (ultimo != '(') {
                    return false;
                }
            } else if (character == '}') {
                if (cadaParentesis.isEmpty()) {
                    return false;
                }

                ultimo = cadaParentesis.pop();

                if (ultimo != '{') {
                    return false;
                }
            } else {
                if (cadaParentesis.isEmpty()) {
                    return false;
                }

                ultimo = cadaParentesis.pop();

                if (ultimo != '[') {
                    return false;
                }
            }
        } return cadaParentesis.isEmpty();
    }
}
