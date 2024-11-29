import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static Map<String, Integer> frequency (String[] palabras) {
        Map<String, Integer> frecuencia = new HashMap<>();

        for (String palabra : palabras) {
            if (!frecuencia.containsKey(palabra)) {
                frecuencia.put(palabra, 1);
            } else {
                frecuencia.put(palabra, frecuencia.get(palabra) + 1);
            }
        } return frecuencia;
    }

    public static void main(String[] args) {
        System.out.println(frequency(new String[] {"uno", "dos", "dos", "tres", "tres", "tres", "uno"}));
    }
}
