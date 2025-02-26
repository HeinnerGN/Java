package ejerciciosjava;

import java.util.Scanner;

public class Gestion_tareas {
    static Scanner dato = new Scanner(System.in);
    static String acumuladortareas = "";

    public Gestion_tareas() {
        System.out.println("Ejercicio 21: Gestion de tareas");
        System.out.println("");
        procesardatos();
    }

    public static void tomardatos() {
        System.out.println("Ingrese el nombre de la tarea:");
        String tarea = dato.nextLine();
        System.out.println("Ingrese la descripcion de la tarea:");
        String descrip = dato.nextLine();
        System.out.println("Ingrese la fecha de vencimiento (Dia/Mes/Año):");
        String vencimiento = dato.nextLine();

        acumuladortareas += "Tarea: " + tarea + "\nDescripcion: " + descrip + "\nFecha de Vencimiento: " + vencimiento + "\n\n";
    }

    public static void procesardatos() {
        int opcion = 0;
        
        do {
            tomardatos();
            System.out.println("Desea agregar otra tarea?");
            System.out.println("1. Si");
            System.out.println("2. No");
            opcion = dato.nextInt();
            dato.nextLine();

        } while (opcion == 1);
        mostrardatos();
    }

    public static void mostrardatos() {
        System.out.println("Lista de tareas:");
        if (acumuladortareas.isEmpty()) {
            System.out.println("No se han ingresado tareas.");
        } else {
            System.out.println(acumuladortareas);
        }
    }
}
