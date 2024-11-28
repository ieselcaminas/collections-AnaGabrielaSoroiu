import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        System.out.println("Ingrese el número de alumnos: ");
        int numeroAlumnos = numeroAlumnos();

        System.out.println("Introduzca la altura de los alumnos: ");
        ArrayList<Double> alturas = leerAlturas(numeroAlumnos);

        double media = calcularMedia(alturas);

        int alumnosAlturaSuperior = calcularAlumnosAlturaSuperior(alturas, media);
        int alumnosAlturaInferior = calcularAlumnosAlturainferior(alturas, media);

        mostrarResultados(alturas, media, alumnosAlturaSuperior, alumnosAlturaInferior);
    }

    public static int numeroAlumnos() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    public static ArrayList <Double> leerAlturas (int numeroAlumnos) {
        ArrayList<Double> altura = new ArrayList<>();
        double alturas;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeroAlumnos; i++) {
            alturas = sc.nextDouble();
            altura.add(alturas);
        }
        return altura;
    }

    public static double calcularMedia (ArrayList<Double> altura) {
        double suma = 0;
        double media;

        for (int i = 0; i < altura.size(); i++) {
            suma += altura.get(i);
        }

        media = suma / altura.size();

        return media;
    }

    public static int calcularAlumnosAlturaSuperior (ArrayList<Double> altura, double media) {
        int alturaSuperior = 0;

        for (int i = 0; i < altura.size(); i++) {
            if (altura.get(i) > media) {
                alturaSuperior++;
            }
        } return alturaSuperior;
    }

    public static int calcularAlumnosAlturainferior (ArrayList<Double> altura, double media) {
        int alturaInferior = 0;

        for (int i = 0; i < altura.size(); i++) {
            if (altura.get(i) < media) {
                alturaInferior++;
            }
        } return alturaInferior;
    }

    public static void mostrarResultados (ArrayList<Double> altura, double media,
                                          int calcularAlumnosAlturaSuperior, int calcularAlumnosAlturaInferior) {
        System.out.println("Alturas de los alumnos:  ");
        for (int i = 0; i < altura.size(); i++) {
            System.out.println("Alumno " + (i + 1) + ": " + altura.get(i));
        }

        System.out.println("Media de las alturas: " + media);
        System.out.println("Número de alumnos con altura superior a la media: " + calcularAlumnosAlturaSuperior);
        System.out.println("Número de alumnos con altura superior a la media: " + calcularAlumnosAlturaInferior);
    }
}
