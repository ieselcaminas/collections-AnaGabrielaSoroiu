package Flujos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problema3 {
   public static void main(String[] args) {
       List<Person> persona = new ArrayList<>();
       Person a = new Person("Jose", "Garcia", 2000);
       persona.add(a);

       Person b = new Person("Ana", "Soroiu", 2005);
       persona.add(b);

       Person c = new Person("Antonia", "Antonia", 1973);
       persona.add(c);

       Person d = new Person("Antonia", "Antonia", 1973);
       persona.add(d);

       List<String> ordenAlfabetico = persona.stream()
               .map(Person::getFirstName)
               .sorted()
               .distinct()
               .collect(Collectors.toList());

       System.out.println(ordenAlfabetico);
   }
}
