package Ordenacion;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {
    public static void main(String[] args) {
        List<Human> personas = new ArrayList<>();

        Human a = new Human("Pepe", "Lopez", 1200);
        personas.add(a);

        Human b = new Human("Alejandro", "Lopez", 1500);
        personas.add(b);

        Human c = new Human("Paco", "Ortiz", 2000);
        personas.add(c);

        personas.stream()
                .sorted()
                .forEach(persona -> System.out.println(persona));
    }

}
