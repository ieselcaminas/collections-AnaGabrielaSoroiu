import java.util.HashMap;
import java.util.Map;


public class MejorTerminacion {
    public static Map<Character, Integer> terminaciones (String[] boletos) {
        Map<Character, Integer> terminaciones = new HashMap<>();
        Character ultimo;
        Integer contador;

        for (String boleto : boletos) {
            ultimo = boleto.charAt(boleto.length() - 1);
            contador = terminaciones.get(ultimo);
            if (contador == null) {
                terminaciones.put(ultimo, 1);
            } else {
                terminaciones.put(ultimo, contador + 1);
            }
        } return terminaciones;
    }

    public static void main(String[] args) {
        System.out.println(terminaciones(new String[] {"03943", "93494", "88824", "95955"}));
    }
}
