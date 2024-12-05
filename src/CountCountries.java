import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> alumnosPaises = countCountries();
    }

    public static Map<String, Integer> countCountries() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Files/Colfuturo-Seleccionados.csv"));
        String line;
        Integer alumnosPais;
        String paisLinea;
        Map<String, Integer> countries = new HashMap<>();

        reader.readLine();

        while ((line = reader.readLine()) != null) {
            String[] country = line.split(",");
            paisLinea = country[6];

            alumnosPais = countries.getOrDefault(paisLinea, 0);

            if (!countries.containsKey(paisLinea)) {
                countries.put(paisLinea, 1);
            } else {
                countries.put(paisLinea, alumnosPais + 1);
            }
        } reader.close();

        for (Map.Entry<String, Integer> contarPaises : countries.entrySet()) {
            System.out.println(contarPaises.getKey() + " " + contarPaises.getValue());
        } return countries;

    }
}

