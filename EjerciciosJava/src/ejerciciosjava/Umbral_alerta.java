package ejerciciosjava;
import java.util.Scanner;

public class Umbral_alerta {
   int umbral_alerta=35;
    
    public Umbral_alerta(){
        System.out.println("Ejercicio 4: Temperatura y alerta");
        System.out.println("");
    }
    
    public void tomardatos(){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese la temperatura actual:");
        int temp = dato.nextInt();
        procesardatos(temp);
    }
        
        public void procesardatos(int temp){
            String resultado;
            if (temp<umbral_alerta){
                resultado=("Temperatura normal.");
            }else{
                resultado=("Alerta. Temperatura alta.");
            }
            mostrardatos(resultado);
        }
        
        public void mostrardatos(String resultado){
            System.out.println(resultado);
    }
    
}
