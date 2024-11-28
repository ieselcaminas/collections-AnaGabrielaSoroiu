import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<>();
        mapa1.put("españa", "Madrid");
        mapa1.put("francia", "Paris");
        mapa1.put("italia", "Roma");
        mapa1.put("alemania", "Berlin");

        System.out.println("Introduzca un país: ");
        String pais = pais(mapa1);
    }

    public static String pais (Map<String, String> mapa1) {
        Scanner sc = new Scanner(System.in);

        String pais = sc.nextLine();
        String minuscula;

        minuscula = pais.toLowerCase();

        if (!mapa1.containsKey(minuscula)) {
            System.out.println("No está.");
        } else {
            System.out.println("La capital es: " + mapa1.get(minuscula));
        }
        return pais;
    }
}
