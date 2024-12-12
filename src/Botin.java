import java.util.HashMap;
import java.util.Map;

public class Botin {

    public static void main(String[] args) {
        Map<Integer, String> repartir = botin(3, new String[] {"10", "20", "50", "200", "500"});

        System.out.println(repartir.toString());
    }

    public static Map<Integer, String> botin (int ladrones, String[] billetes) {
        Map<Integer, String> botin = new HashMap<>();
        int leToca;

        for (int i = 0; i < billetes.length; i++) {
            //Si devuelve 0, tiene que volver a empezar por el primero.
            leToca = i % ladrones;

            if (!botin.containsKey(leToca)) {
                botin.put(leToca, billetes[i]);
            } else {
                botin.put(leToca, billetes[i] + " " + botin.get(leToca));
            }
        } return botin;
    }
}
