package ejerciciosjava;

import java.util.Scanner;

public class Cine {
    
    public Cine(){
        System.out.println("Ejercicio 8: Cine");
        System.out.println("");
    }
    
    public static void tomardatos(){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad=dato.nextInt();
    }
    
}
