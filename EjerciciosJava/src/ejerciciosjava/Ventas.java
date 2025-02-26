package ejerciciosjava;

import java.util.Scanner;

public class Ventas {
    static Scanner dato = new Scanner(System.in);
    static String ventas = "";
    static int total = 0;

    public Ventas() {
        System.out.println("Ejercicio 27: Proceso de ventas en tienda");
        System.out.println("");
        procesardatos();
    }

    public static void tomardatos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            String producto;
            int precio = 0;
            int cant;
            System.out.println("Ingrese el nombre del producto: ");
            producto = dato.nextLine();

            boolean preciovalido = false;
            while (!preciovalido) {
                System.out.println("Ingrese el precio del producto: ");
                try {
                    precio = dato.nextInt();
                    if (precio >= 0) {
                        preciovalido = true;
                    } else {
                        System.out.println("Error. El precio no puede ser negativo.");
                    }
                } catch (Exception e) {
                    System.out.println("Error. Debe ingresar un numero valido para el precio.");
                    dato.nextLine();
                }
            }

            boolean cantidadvalida = false;
            while (!cantidadvalida) {
                System.out.println("Ingrese la cantidad vendida del producto: " + (i + 1));
                try {
                    cantidad = dato.nextInt();
                    if (cantidad >= 0) {
                        cantidadvalida = true;
                    } else {
                        System.out.println("Error. La cantidad no puede ser negativa.");
                    }
                } catch (Exception e) {
                    System.out.println("Error. Debe ingresar un numero valido para la cantidad.");
                    dato.nextLine();
                }
            }
            dato.nextLine();
            int totalventa = precio * cantidad;
            total += totalventa;
            ventas += "Producto: " + producto + " - Precio: " + precio + " - Cantidad: " + cantidad + " - Total: " + totalventa;
        }
    }

    public static void procesardatos() {
        System.out.println("Cuantas ventas desea registrar?");
        int cantidadvent = dato.nextInt();
        dato.nextLine();
        tomardatos(cantidadvent);
        mostrardatos();
    }

    public static void mostrardatos() {
        System.out.println("Resumen de ventas:");
        if (ventas.isEmpty()) {
            System.out.println("No se han registrado ventas.");
        } else {
            System.out.println(ventas);
        }

        System.out.println("Total de ventas: " + total);
    }
}
