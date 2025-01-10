package Ordenacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ej2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/Ordenacion/illiterate.csv"));
        reader.readLine();
        String line;
        List<Analfabetos> analfabetos = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
        String[] datos = line.split(",");

        String pais = datos[5];
        int cantidad = Integer.parseInt(datos[8]);

        Analfabetos a = new Analfabetos(pais, cantidad);
        analfabetos.add(a);
        }

        analfabetos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
