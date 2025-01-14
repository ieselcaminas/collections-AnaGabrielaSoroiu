package Ordenacion;

import java.util.ArrayList;
import java.util.List;

public class TareaFelipe {
    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();

        Tarea a = new Tarea(1, 35);
        tareas.add(a);

        Tarea b = new Tarea(5, 10);
        tareas.add(b);

        Tarea c = new Tarea(2, 15);
        tareas.add(c);

        Tarea d = new Tarea(2, 10);
        tareas.add(d);

        tareas.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
