package ejerciciosjava;
import java.util.Scanner;

public class Ascensor {
    public Ascensor(){
        System.out.println("Ejercicio 1: Ascensor");
        System.out.println("");
    }
        
        public void tomardatos(){
            Scanner num = new Scanner(System.in);
            System.out.println("Ingrese el piso que desea ir:");
            int piso=num.nextInt();
            
            if (piso>=1 && piso<=20){
            System.out.println("El ascensor se mueve al piso deseado.");
        }
            else{
                System.out.println("Error. Piso inexistente.");
            }
        }       
}