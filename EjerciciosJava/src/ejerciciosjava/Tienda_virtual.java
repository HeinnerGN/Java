package ejerciciosjava;

import java.util.Scanner;

public class Tienda_virtual {
    static Scanner dato = new Scanner(System.in);
    static String productos = "";
    static double totalcompra = 0.0;

    public Tienda_virtual() {
        System.out.println("Ejercicio 24: Compra en tienda virtual");
        System.out.println("");
        procesardatos();
    }

    public static void tomardatos(int cantidadProductos) {
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            String producto = dato.nextLine();
            System.out.println("Ingrese el precio del producto " + (i + 1) + ":");
            double precio = dato.nextDouble();
            dato.nextLine();

            productos += "Producto: " + producto + " | Precio: " + precio + "\n";
            totalcompra += precio;
        }
    }

    public static void procesardatos() {
        System.out.println("Cuantos productos desea agregar al carrito?");
        int cantidadProductos = dato.nextInt();
        dato.nextLine();
        tomardatos(cantidadProductos);
        mostrardatos();
    }

    public static void mostrardatos() {
        System.out.println("Resumen de la compra:");
        if (productos.isEmpty()) {
            System.out.println("No se han agregado productos.");
        } else {
            System.out.println(productos);
        }
        System.out.println("Total de la compra: $" + totalcompra);
    }
}
