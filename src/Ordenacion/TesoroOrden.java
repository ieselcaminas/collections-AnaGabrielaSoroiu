package Ordenacion;

import java.util.ArrayList;
import java.util.List;

public class TesoroOrden {
    public static void main(String[] args) {
        List<Tesoro> tesoros = new ArrayList<>();

        Tesoro a = new Tesoro("flecha", 5, 1, 1);
        tesoros.add(a);

        Tesoro b = new Tesoro("sandalias", 10, 2.05, 5);
        tesoros.add(b);

        Tesoro c = new Tesoro("sarcofago", 1000, 1000, 3);
        tesoros.add(c);

        Tesoro d = new Tesoro("mascara", 1000, 1000, 4);
        tesoros.add(d);

        Tesoro e = new Tesoro("arco", 10, 2, 2);
        tesoros.add(e);

        tesoros.stream()
                .sorted()
                .forEach(System.out::print);
    }
}
