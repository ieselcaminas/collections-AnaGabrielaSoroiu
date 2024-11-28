import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Map<String, Integer> contactos = new HashMap<>();
        contactos.put("pepe", 1111);
        contactos.put("jorge", 2222);
        contactos.put("ramona", 3333);
        contactos.put("paquita", 4444);

        System.out.println("Introduzca un contacto: ");
        String telefono = telefonos(contactos);
    }

    public static String telefonos (Map<String, Integer> contactos) {
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
