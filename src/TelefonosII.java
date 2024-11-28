import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelefonosII {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> contactos = new HashMap<>();
        ArrayList<Integer> telefonos = new ArrayList<>();
        telefonos.add(5555);
        telefonos.add(6666);
        contactos.put("pepe", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add(7777);
        contactos.put("ramona", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add(8888);
        telefonos.add(9999);
        telefonos.add(0000);

        contactos.put("paquita", telefonos);

        System.out.println("Introduzca un contacto: ");
        String telefono = telefonos(contactos);
    }

    public static String telefonos (Map<String, ArrayList<Integer>> contactos) {
        Scanner sc = new Scanner(System.in);

        String contacto = sc.nextLine();
        String minuscula;

        minuscula = contacto.toLowerCase();

        if (!contactos.containsKey(minuscula)) {
            System.out.println("Contacto no encontrado.");
        } else {
            System.out.println("El teléfono del contacto  " + contacto + " es " + contactos.get(minuscula));
        }
        return contacto;
    }
}
