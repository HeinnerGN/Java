package ejerciciosjava;

import java.util.Scanner;

public class Lista_numeros {
    static Scanner dato = new Scanner(System.in);

    public Lista_numeros() {
        System.out.println("Ejercicio 26: Sumar numeros");
        System.out.println("");
        procesardatos();
    }

    public static void tomardatos(int cantidadNumeros) {
        int suma = 0;
        for (int i = 0; i < cantidadNumeros; i++) {
            boolean numeroValido = false;
            int numero = 0;

            while (!numeroValido) {
                System.out.println("Ingrese el numero: ");
                try {
                    numero = dato.nextInt();
                    numeroValido = true;
                } catch (Exception e) {
                    System.out.println("Error. Debe ingresar un numero valido.");
                    dato.nextLine();
                }
            }
            suma += numero;
        }
        System.out.println("La suma total de los numeros es: " + suma);
    }

    public static void procesardatos() {
        System.out.println("Cuantos numeros desea ingresar?");
        int cantidad = dato.nextInt();
        tomardatos(cantidad);
    }
}
