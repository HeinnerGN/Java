package ejerciciosjava;

import java.util.Scanner;

public class Compra_tienda {
    static Scanner dato = new Scanner(System.in);
    
    public static void Compra_tienda(){
        System.out.println("Ejercicio 12: Compra tienda en linea");
        System.out.println("");
        tomardatos();
    }
    
    public static void tomardatos(){
        int opcion=0;
        System.out.println("Ingrese el precio del producto (Elija un numero para su compra)");
        System.out.println("1. Celular: $80000");
        System.out.println("2. Silla: $10000");
        System.out.println("3. Laptop: $120000");
        System.out.println("4. Salir");
        int num=dato.nextInt();
        System.out.println("Ingrese la cantidad de compra");
        int cant=dato.nextInt();
        procesardatos(num, opcion, cant);
    }
    
    public static void procesardatos(int num, int opcion, int cant){
        while(opcion==0){
            System.out.println("Su compra solo fue: "+num);
            switch(num){
                case 1:
                    System.out.println("Su compra fue: "+num + "y el total de su compra fue " + cant*80000);
                    break;
                case 2:
                    System.out.println("Su compra fue: "+num+" y el total de su compra fue" + cant*10000);
                    break;
                case 3:
                    System.out.println("Su compra fue: "+num+" y el total de su compra "+cant*120000);
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
            }
            
        }
    }
    
}
