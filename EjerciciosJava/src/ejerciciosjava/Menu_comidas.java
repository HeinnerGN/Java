package ejerciciosjava;

import java.util.Scanner;

public class Menu_comidas {
    static Scanner dato = new Scanner(System.in);

    public Menu_comidas() {
        System.out.println("Ejercicio 18: Comidas rapidas");
        System.out.println("");
        tomardatos();
    }

    public static void tomardatos() {
        int total = 0;
        int opcion;
        do {
            System.out.println("Menu de Comidas Rapidas");
            System.out.println("1. Hamburguesa: $8000");
            System.out.println("2. Papas fritas: $2000");
            System.out.println("3. Refresco: $6000");
            System.out.println("4. Hot dog: $4000");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion (1-5):");
            opcion = dato.nextInt();
            procesardatos(opcion, total);
        } 
        while (opcion != 5);
        
        System.out.println("\nCosto total de su pedido: $" + total);
        System.out.println("Disfrute de su comida.");
    }

    public static void procesardatos(int opcion, int total) {
        switch (opcion) {
            case 1:
                total += 8000;
                System.out.println("Has agregado una hamburguesa. Precio: $8000");
                break;
            case 2:
                total += 2000;
                System.out.println("Has agregado papas fritas. Precio: $2000");
                break;
            case 3:
                total += 6000;
                System.out.println("Has agregado una bebida. Precio: $6000");
                break;
            case 4:
                total += 4000;
                System.out.println("Has agregado un hot dog. Precio: $4000");
                break;
            case 5:
                System.out.println("Saliendo del menu...");
                break;
            default:
                System.out.println("Opción no válida, por favor elija nuevamente.");
        }
    }
}
