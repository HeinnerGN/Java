package ejerciciosjava;

import java.util.Scanner;

public class Viaje_coche {
    static Scanner dato = new Scanner(System.in);

    public static void Viaje_coche(){
        System.out.println("Ejercicio 14: Viaje en coche");
        System.out.println("");
        tomardatos();
    }

    public static void tomardatos(){
        System.out.println("Ingrese la distancia total del viaje en kilometros:");
        double distancia = dato.nextDouble();
        System.out.println("Ingrese la velocidad promedio del coche en km/h:");
        double velocidad = dato.nextDouble();
        procesardatos(distancia, velocidad);
    }

    public static void procesardatos(double distancia, double velocidad){
        boolean opcion = true;
        while(opcion){
            double tiempo = distancia / velocidad;
            System.out.println("El tiempo estimado de viaje es: " + tiempo + " horas");
            System.out.println("-------");
            System.out.println("Desea hacer otro viaje?");
            System.out.println("1. Si");
            System.out.println("2. No");
            int info = dato.nextInt();
            if(info == 1){
                tomardatos();
            } else if(info == 2){
                opcion = false;
                break;
            }

            
        }
    }
}
