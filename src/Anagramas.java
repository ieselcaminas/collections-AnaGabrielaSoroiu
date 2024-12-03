import java.io.*;
import java.util.*;

public class Anagramas {
    public static void main(String[] args) throws IOException {
        Map<String, ArrayList<String>> map = anagrams();
    }

    public static Map<String, ArrayList<String>> anagrams()throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Files/spanish-dict.txt"));
        String line;
        String palabraOrdenada;
        Map<String, ArrayList<String>> palabrasOrdenadas = new HashMap<>();


        while ((line = reader.readLine()) != null) {
            palabraOrdenada = alphabetize(line);

            if (!palabrasOrdenadas.containsKey(palabraOrdenada)) {
                palabrasOrdenadas.put(palabraOrdenada,new ArrayList<>());
            }
            palabrasOrdenadas.get(palabraOrdenada).add(line);
        }
        reader.close();

        for (Map.Entry<String, ArrayList<String>> anagramas : palabrasOrdenadas.entrySet()) {
            System.out.println(anagramas.getKey() + " " + anagramas.getValue());
            System.out.println( );
        }
        return palabrasOrdenadas;
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}