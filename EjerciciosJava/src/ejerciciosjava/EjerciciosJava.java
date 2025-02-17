package ejerciciosjava;
import java.util.Scanner;

public class EjerciciosJava {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 a 30 para ver los ejercicios:");
   
        int opcion = teclado.nextInt();
        if (opcion > 0 && opcion <= 30){
            if (opcion == 1) {Ascensor objAscensor = new Ascensor();
            objAscensor.tomardatos();}
            if (opcion == 2) {Ascensor_peso objAscensor_peso = new Ascensor_peso();
            objAscensor_peso.tomardatos();}
            if (opcion == 3) {Temperatura objTemperatura = new Temperatura();}
            if (opcion == 4) {Umbral_alerta objAlerta = new Umbral_alerta();
            objAlerta.tomardatos();}
            if (opcion == 5) {Combinacion objCombinacion = new Combinacion();}
        }
        else{
            System.out.println("Error, numero no valido."
                    + "Vuelva a ingresar un numero de 1 a 30.");
            teclado.nextLine();
        }
    }
}