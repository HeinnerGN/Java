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
        System.out.println("Ingrese el precio del producto (Elija un numero para su compra)");
        System.out.println("1. Celular: $80000");
        System.out.println("2. Silla: $10000");
        System.out.println("3. Laptop: $120000");
        System.out.println("4. Salir");
        int num=dato.nextInt();
        procesardatos(num);
    }
    
    public static void procesardatos(int num){
        int cant;
        int opcion=0;
        while(opcion==0){
            switch(num){
                case 1:
                    System.out.println("Ingrese la cantidad de compra");
                    cant=dato.nextInt();
                    System.out.println("Su compra fue: "+cant+" Celular");
                    mostrardatos(num,1,cant);
                    System.out.println("Quiere seguir comprando?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    int info=dato.nextInt();
                    if(info==1){
                        tomardatos();
                    }else if(info==2){
                        System.out.println("Gracias por su compra. Presione 0 para salir del todo.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de compra");
                    cant=dato.nextInt();
                    System.out.println("Su compra fue: "+cant+" Silla");
                    mostrardatos(num,2,cant);
                    System.out.println("Quiere seguir comprando?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    int info2=dato.nextInt();
                    if(info2==1){
                        tomardatos();
                    }else if(info2==2){
                        System.out.println("Gracias por su compra. Presione 0 para salir del todo.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de compra");
                    cant=dato.nextInt();
                    System.out.println("Su compra fue: "+cant+" Laptop");
                    mostrardatos(num,3,cant);
                    System.out.println("Quiere seguir comprando?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    int info3=dato.nextInt();
                    if(info3==1){
                        tomardatos();
                    }else if(info3==2){
                        System.out.println("Gracias por su compra. Presione 0 para salir del todo.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    System.out.println("Gracias por su compra. Presione 0 para salir del todo.");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            System.out.println("Presione 0 para salir");
            opcion=dato.nextInt();
            if(opcion==0){
                System.out.println("Vuelva pronto");
                break;
            }
        }
    }
    
    public static void mostrardatos(int num, int opcion, int cant){
        switch(num){
            case 1:
                System.out.println("El total de su compra es: "+cant*80000);
                break;
            case 2:
                System.out.println("El total de su compra es: "+cant*10000);
                break;
            case 3:
                System.out.println("El total de su compra es: "+cant*120000);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
