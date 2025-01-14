package Ordenacion;

import java.util.ArrayList;
import java.util.List;

public class OrdenTesoro {
    public static void main(String[] args) {
        List<Tesoro> tesoros = new ArrayList<>();

        Tesoro a = new Tesoro("flecha", 5, 1);
        tesoros.add(a);

        Tesoro b = new Tesoro("sandalias", 10, 2.05);
        tesoros.add(b);

        Tesoro c = new Tesoro("sarcofago", 1000, 1000);
        tesoros.add(c);

        Tesoro d = new Tesoro("mascara", 1000, 10.5);
        tesoros.add(d);

        Tesoro e = new Tesoro("arco", 10, 2);
        tesoros.add(e);

        tesoros.stream()
                .sorted()
                .forEach(System.out::print);


    }
}
