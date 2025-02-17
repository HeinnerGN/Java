package ejerciciosjava;
import java.util.Scanner;

public class Ascensor_peso {
    public Ascensor_peso(){
        System.out.println("Ejercicio 2: Limite peso");
        System.out.println("");
    }
    
    public void tomardatos(){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese su peso corporal en kg:");
        double peso=dato.nextDouble();
        
        if (peso > 500){
                System.out.println("Limite de peso. Haga ejercicio cabra");
            }
        else{
            System.out.println("Ingrese el piso que desea ir (1-10):");
            int piso=dato.nextInt();
            if(piso>1 && piso<10){
                System.out.println("Ascensor en movimiento.");
            }else {
                System.out.println("Piso no valido."
                        + "Ingrese un numero correctamente:");
            }
        }
    }
}