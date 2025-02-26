package ejerciciosjava;

import java.util.Scanner;

public class Agenda_contactos {
    static Scanner dato = new Scanner(System.in);
    static String contactos = "";

    public Agenda_contactos() {
        System.out.println("Ejercicio 25: Agenda de contactos");
        System.out.println("");
        procesardatos();
    }

    public static void tomardatos(int cantidadContactos) {
        for (int i = 0; i < cantidadContactos; i++) {
            System.out.println("Ingrese el nombre del contacto " + (i + 1) + ":");
            String nombre = dato.nextLine();
            System.out.println("Ingrese el numero de telefono del contacto " + (i + 1) + ":");
            String telefono = dato.nextLine();

            contactos += "Contacto " + (i + 1) + " - Nombre: " + nombre + " | Telefono: " + telefono + "\n";
        }
    }

    public static void procesardatos() {
        System.out.println("Cuantos contactos desea agregar a la agenda?");
        int cantidad = dato.nextInt();
        dato.nextLine();
        tomardatos(cantidad);
        mostrardatos();
    }

    public static void mostrardatos() {
        System.out.println("Lista de contactos registrados:");
        if (contactos.isEmpty()) {
            System.out.println("No se han agregado contactos.");
        } else {
            System.out.println(contactos);
        }
    }
}
