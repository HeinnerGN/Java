package ejerciciosjava;
import java.util.Scanner;

public class Temperatura {
    
    public Temperatura(){
        System.out.println("Ejercicio 3: Temperatura.");
        System.out.println("");
        Temperatura.tomardatos();
    }
    
    public static void tomardatos(){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la temperatura actual:");
        int temp = dato.nextInt();
        
        if (temp>18 && temp<25){
            System.out.println("La temperatura es adecuada.");
        }
        else{
            System.out.println("Temperatura fuera del rango.");
        }
    }
    
}
