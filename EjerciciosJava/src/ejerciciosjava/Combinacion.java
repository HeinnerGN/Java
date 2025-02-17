package ejerciciosjava;
import java.util.Scanner;

public class Combinacion {
    static int limite_temp=30;
    
    public Combinacion(){
        System.out.println("Ejercicio 5: Combinacion del 3 y 4");
        System.out.println("");
        tomardatos();
    }
        
        public static void tomardatos(){
            Scanner info = new Scanner(System.in);
            System.out.println("Ingrese la temperatura actual:");
            int temp = info.nextInt();
            procesardatos(temp,info);
        }
        
        public static void procesardatos(int temp, Scanner info){
            String resultado = null;
            if(temp>limite_temp){
                System.out.println("Temperatura inadecuada para el movimiento del ascensor.");
            }
            else{
                System.out.println("Ingrese el piso que desea ir (1-10):");
                int piso = info.nextInt();
                if(piso>=1 && piso<10){
                    resultado=("Ascensor en movimeinto.");
                }else{
                    resultado=("Error. Piso inexistente.");
                }
            }
            mostrardatos(resultado);
        }
        
        public static void mostrardatos(String resultado){
            System.out.println(resultado);
        }
}
