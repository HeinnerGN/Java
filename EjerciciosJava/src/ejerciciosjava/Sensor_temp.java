package ejerciciosjava;

import java.util.Scanner;

public class Sensor_temp {
    static Scanner dato = new Scanner(System.in);
    
    public Sensor_temp(){
        System.out.println("Ejercicio 19: Sensor de temperatura");
        System.out.println("");
        tomardatos();
    }
    
    public static void tomardatos(){
        System.out.println("Ingrese la temperatura");
        int temp=dato.nextInt();
        procesardatos(temp);
    }
    
    public static void procesardatos(int temp){
        do{
            if(temp>=18 && temp<=25){
                System.out.println("Temperatura dentro del rango.");
            }
            else{
                System.out.println("Alerta. Temperatura fuera del rango .");
                tomardatos();
            }
        }while(temp<18 && temp>25);
    }
    
}
