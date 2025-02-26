package ejerciciosjava;

import java.util.Scanner;

public class Cuenta_regresiva {
    static Scanner dato = new Scanner(System.in);

    public static void Cuenta_regresiva() {
        System.out.println("Ejercicio 15: Cuenta regresiva");
        System.out.println("");
        tomardatos();
    }

    public static void tomardatos() {
        System.out.println("Ingrese un numero entero positivo para comenzar la cuenta regresiva:");
        int numero = dato.nextInt();
        if (numero > 0) {
            procesardatos(numero);
        } else {
            System.out.println("Por favor ingrese un número entero positivo.");
            tomardatos();
        }
    }

    public static void procesardatos(int numero) {
        int opcion = 0;
        while(opcion == 0){
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Tiempo cumplido!");
            System.out.println("-------");
            System.out.println("Desea hacer otra cuenta regresiva?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int info = dato.nextInt();
            
            if (info == 1) {
                tomardatos();
            } else if (info == 2) {
                System.out.println("El juego ha terminado.");
            }

            System.out.println("Presione 0 para salir.");
            opcion = dato.nextInt();
            break;
        }
    }
}
