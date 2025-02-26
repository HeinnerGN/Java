package ejerciciosjava;

import java.util.Scanner;
import java.util.Random;

public class Adivinanza {
    static Scanner dato = new Scanner(System.in);
    static Random random = new Random();
    
    public static void Adivinanza(){
        System.out.println("Ejercicio 16: Juego de Adivinanza");
        System.out.println("");
        jugar();
    }

    public static void jugar() {
        int azar = random.nextInt(100) + 1;
        int intento = 0;
        int numusuario = 0;
        
        System.out.println("Hola, empecemos con el juego. Espero que te diviertas!");
        System.out.println("");
        System.out.println("He generado un numero entre 1 y 100. Intenta adivinarlo");
        System.out.println("----------------");
        
        while (numusuario != azar) {
            System.out.println("Introduce un numero entre 1 y 100:");
            numusuario = dato.nextInt();
            
            if (numusuario < azar) {
                System.out.println("El numero es mayor. Sigue intentando");
            } else if (numusuario > azar) {
                System.out.println("El numero es menor. Sigue intentando");
            }
            intento++;
        }
        
        System.out.println("Felicidades. Has adivinado el numero en " + intento + " intentos.");
        
        System.out.println("Quieres jugar otra vez?");
        System.out.println("1. Si");
        System.out.println("2. No");
        
        int respuesta = dato.nextInt();
        if (respuesta == 1) {
            jugar();
        } else {
            System.out.println("Gracias por jugar. Espero que te hayas divertido.");
        }
    }
}
