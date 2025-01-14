package Ordenacion;

import java.util.ArrayList;
import java.util.List;

public class RegaloBueno {
    public static void main(String[] args) {
        List<Regalo> regalos = new ArrayList<>();

        Regalo a = new Regalo(80, 2.5);
        regalos.add(a);

        Regalo b = new Regalo(100, 12);
        regalos.add(b);

        Regalo c = new Regalo(100, 1.05);
        regalos.add(c);

        regalos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
