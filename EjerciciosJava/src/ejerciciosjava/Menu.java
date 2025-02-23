package ejerciciosjava;

import java.util.Scanner;

public class Menu {
    static Scanner cliente = new Scanner(System.in);
    
    public Menu(){
        System.out.println("Ejercicio 10: Menu restaurante");
        System.out.println("");
        tomardatos();
    }
    
    public static void tomardatos(){
        System.out.println("Seleccione un numero para su compra:");
        System.out.println("1. Platos");
        System.out.println("2. Bebidas");
        System.out.println("3. Salir");
        int num=cliente.nextInt();
        procesardatos(num);
    }
    
    public static void procesardatos(int num){
        switch(num){
            case 1:
                System.out.println("Ingrese un numero para hacer su pedido:");
                System.out.println("1. Hamburguesa: $10.000");
                System.out.println("2. Spaguetti: $20.000");
                System.out.println("3. Ensalada de frutas: $8.000");
                int platos=cliente.nextInt();
                mostrardatos(platos, 1);
                break;
            case 2:
                System.out.println("Ingrese un numero para hacer su pedido:");
                System.out.println("1. Coca cola: $7.000");
                System.out.println("2. Jugo: $5.000");
                System.out.println("3. Cerveza: $6.000");
                int bebidas=cliente.nextInt();
                mostrardatos(bebidas, 2);
                break;
            case 3:
                System.out.println("Graccias por utilizar el sistema. "+"Vuelva pronto");
                break;
            default:
                System.out.println("Error, compra invalidad."+" Intente de nuevo ingresando el numero correcto.");
                break;
        }
        if (num !=3){
            tomardatos();
        }
    }
    
    public static void mostrardatos(int num, int opcion){
        if(opcion==1){
            switch(num){
                case 1:
                    System.out.println("Su compra fue: Hamburguesa.");
                    break;
                case 2:
                    System.out.println("Su compra fue: Spaguetti.");
                    break;
                case 3:
                    System.out.println("Su compra fue: Ensalada de frutas.");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        else if(opcion==2){
            switch(num){
                case 1:
                    System.out.println("Su compra fue: Coca cola.");
                    break;
                case 2:
                    System.out.println("Su compra fue: Jugo.");
                    break;
                case 3:
                    System.out.println("Su compra fue: Cerveza");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
    }
    
}
