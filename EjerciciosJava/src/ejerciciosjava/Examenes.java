package ejerciciosjava;

import java.util.Scanner;

public class Examenes {
    
    static Scanner dato = new Scanner(System.in);
    
    public Examenes() {
        System.out.println("Ejercicio 20: Resultado de exámenes");
        System.out.println("");
        tomardatos();
    }
    
    public static void tomardatos() {
        double resultado;
        int contador = 0;
        double suma = 0;
        char continuar;
        
        do {
            System.out.print("Ingrese el resultado del examen: ");
            resultado = dato.nextDouble();
            suma += resultado;
            contador++;

            System.out.print("Desea ingresar otro examen? (s/n): ");
            continuar = dato.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        if (contador > 0) {
            double promedio = suma / contador;
            procesardatos(promedio, contador);
        } else {
            System.out.println("No se ingresaron resultados.");
        }
    }
    
    public static void procesardatos(double promedio, int contador) {
        System.out.println("\nTotal de examenes ingresados: " + contador);
        System.out.println("Promedio de los resultados: " + promedio);

        if (promedio >= 6) {
            System.out.println("Felicidades. Has aprobado.");
        } else {
            System.out.println("Lo siento, has reprobado.");
        }
    }
}
