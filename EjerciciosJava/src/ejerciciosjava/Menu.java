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
        double totalcompra=0;
        double totalplatos=0;
        double totalbebidas=0;
        double valortotal=0;
        switch(num){
            case 1:
                System.out.println("Ingrese un numero para hacer su pedido:");
                System.out.println("1. Hamburguesa: $10.000");
                System.out.println("2. Spaguetti: $20.000");
                System.out.println("3. Ensalada de frutas: $8.000");
                int platos=cliente.nextInt();
                
                totalplatos=calcularplatos(platos);
                mostrardatos(platos, 1);
                break;
            case 2:
                System.out.println("Ingrese un numero para hacer su pedido:");
                System.out.println("1. Coca cola: $7.000");
                System.out.println("2. Jugo: $5.000");
                System.out.println("3. Cerveza: $6.000");
                int bebidas=cliente.nextInt();
                
                totalbebidas=calcularbebidas(bebidas);
                mostrardatos(bebidas, 2);
                break;
            case 3:
                totalcompra=totalplatos+totalbebidas;
                
                System.out.println("Seleccione el metodo de pago:");
                System.out.println("1. Efectivo");
                System.out.println("2. Tarjeta de credito");
                System.out.println("3. Cheque");
                int numb=cliente.nextInt();
                
                if(numb==2){
                    System.out.println("Se descontara un 5%");
                    valortotal=totalcompra-(totalcompra*0.05);
                    System.out.println("Valor total a pagar: "+valortotal);
                }
                else if(numb==3){
                    System.out.println("Se descontara un 10%");
                    valortotal=totalcompra-(totalcompra*0.10);
                    System.out.println("Valor total a pagar: "+valortotal);
                }
                else{
                    valortotal=totalcompra;
                    System.out.println("Valor total a pagar: "+valortotal);
                }
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
    
    public static double calcularplatos(int num){
        double precio = 0;
        switch(num){
            case 1:
                precio = 10000;
                break;
            case 2:
                precio = 20000;
                break;
            case 3:
                precio = 8000;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        return precio;
    }
    
    public static double calcularbebidas(int num){
        double precio = 0;
        switch(num){
            case 1:
                precio = 7000;
                break;
            case 2:
                precio = 5000;
                break;
            case 3:
                precio = 6000;
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }
        return precio;
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
