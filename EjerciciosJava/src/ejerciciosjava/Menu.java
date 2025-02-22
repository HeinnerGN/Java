package ejerciciosjava;

import java.util.Scanner;

public class Menu {
    
    public Menu(){
        System.out.println("Ejercicio 10: Menu restaurante");
        System.out.println("");
        tomardatos();
    }
    
    public static void tomardatos(){
        Scanner cliente = new Scanner(System.in);
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
                System.out.println("Hamburguesa: $10.000");
                System.out.println("Spaguetti: $20.000");
                System.out.println("Ensalada de frutas: $8.000");
                break;
            case 2:
                System.out.println("Coca cola: $7.000");
                System.out.println("Jugo: $5.000");
                System.out.println("Cerveza: $6.000");
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                System.out.println("Graccias por utilizar el sistema. "+"Vuelva pronto");
                break;
            default:
                System.out.println("Error, compra invalidad."+" Intente de nuevo ingresando el numero correcto.");
                break;
        }
        mostrardatos();
    }
    
    public static void mostrardatos(){
        System.out.println("Su compra fue: "+1);
    }
    
}
