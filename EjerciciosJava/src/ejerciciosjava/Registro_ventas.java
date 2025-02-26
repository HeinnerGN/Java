package ejerciciosjava;

import java.util.Scanner;

public class Registro_ventas {
    static Scanner dato = new Scanner(System.in);
    static double totalventas = 0.0;
    static String resumenventas = "";

    public Registro_ventas() {
        System.out.println("Ejercicio: Registro de ventas");
        System.out.println("");
        procesardatos();
    }

    public static void tomardatos() {
        System.out.println("Ingrese el nombre del producto:");
        String producto = dato.nextLine();
        System.out.println("Ingrese el precio del producto:");
        double precio = dato.nextDouble();
        dato.nextLine();

        totalventas += precio;
        resumenventas += "Producto: " + producto + " - Precio: " + precio + "\n";
    }

    public static void procesardatos() {
        int opcion = 0;

        do {
            tomardatos();
            
            System.out.println("Desea registrar otra venta?");
            System.out.println("1. Si");
            System.out.println("2. No");
            opcion = dato.nextInt();
            dato.nextLine();

        } while (opcion == 1);
        mostrardatos();
    }

    public static void mostrardatos() {
        System.out.println("Resumen de ventas:");
        if (resumenventas.isEmpty()) {
            System.out.println("No se han registrado ventas.");
        } else {
            System.out.println(resumenventas);
        }
        System.out.println("Monto total de las ventas: $" + totalventas);
    }
}
