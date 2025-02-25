package ejerciciosjava;

import java.util.Scanner;

public class Cajero_automatico {
    static Scanner dato = new Scanner(System.in);
    static int saldo = 100000;
    
    public Cajero_automatico(){
        System.out.println("Ejercicio 11: Cajero automatico");
        System.out.println("");
        tomardatos();
    }
    
    public static void tomardatos(){
        int num=0;
        while(num!=3){
        System.out.println("Ingrese un numero segun lo que queria hacer");
        System.out.println("1. Ver monto");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Salir");
        num=dato.nextInt();
        procesardatos(num);
        }
    }
        
    public static void procesardatos(int num){
        int total=0;
        switch(num){
            case 1:
                System.out.println("Saldo actual: "+saldo);
                break;
            case 2:
                System.out.println("Cuanto quiere retirar?");
                int retirar=dato.nextInt();
                if(retirar<=saldo){
                    total=saldo-retirar;
                    System.out.println("Su saldo actual es de: "+total);
                    break;
                }
                else if(retirar>saldo){
                    System.out.println("Error. Exceso del limite");
                    break;
                }
            case 3:
                System.out.println("Se ha salido del programa");
                
                break;
            default:
                System.out.println("Error.");
                break;
        }
    }
    
    public static void mostrardatos(int total){
        System.out.println();
    }
}
