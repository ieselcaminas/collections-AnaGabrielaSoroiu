import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static Map<String, Integer> frecuencia (String[] palabras) {
        Map<String, Integer> frecuencia = new HashMap<String, Integer>();

        for (String palabra : palabras) {
            if (!frecuencia.containsKey(palabra)) {
                frecuencia.put(palabra, 1);
            } else {
                frecuencia.put(palabra, frecuencia.get(palabra) + 1);
            }
        } return frecuencia;
    }

    public static void main(String[] args) {
        System.out.println(frecuencia(new String[] {"uno", "dos", "dos", "tres", "tres", "tres", "uno"}));
    }
}
