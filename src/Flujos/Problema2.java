package Flujos;

import java.util.ArrayList;
import java.util.List;

public class Problema2 {
    public static void main(String[] args) {
        List<Person> persona = new ArrayList<>();
        Person a = new Person("Jose", "Garcia", 2000);
        persona.add(a);

        Person b = new Person("Ana", "Soroiu", 2005);
        persona.add(b);

        Person c = new Person("Maria", "Antonia", 1973);
        persona.add(c);

        Person d = new Person("Antonio", "Antonia", 1973);
        persona.add(d);

        long letraA = persona.stream()
                .filter(p -> p.getFirstName().startsWith("A"))
                .count();

        System.out.println(letraA);
    }
}
