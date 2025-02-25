package ejerciciosjava;

import java.util.Scanner;

public class Impresora {
    static Scanner dato = new Scanner(System.in);
    static int papel=100;
    
    public Impresora(){
        System.out.println("Ejercicio 13: Impresora");
        System.out.println("");
        tomardatos();
    }
    
    public static void tomardatos(){
        System.out.println("Ingrese la cantidad de paginas para imprimir");
        int pag=dato.nextInt();
        procesardatos(pag);
    }
    
    public static void procesardatos(int pag){
        int pagimp=0;
        int opcion=0;
        while(opcion==0){
            if(pag<=papel){
                papel-=pag;
                pagimp+=pag;
                System.out.println("Imprimiendo paginas...");
                System.out.println("Quiere imprimir mas paginas?");
                System.out.println("1.Si");
                System.out.println("2.No");
                int info=dato.nextInt();
                switch(info){
                    case 1:
                        if(info==1){
                            tomardatos();
                            break;
                        }
                    case 2:
                        if(info==2){
                            System.out.println("Saliendo del programa...");
                            mostrardatos(pag, papel);
                            break;
                        }
                    default:
                        System.out.println("...");
                }
            }
            else if(pag>papel){
                System.out.println("Exceso de limite.");
            }
            System.out.println("Presione 0 para salir");
            opcion=dato.nextInt();
            if(opcion==0){
                System.out.println("Ha salido del sistem exitosamente");
            }
            break;
        }
        mostrardatos(pagimp, papel);
    }
    
    public static void mostrardatos(int pagimp, int papel){
        System.out.println("Imprimio "+pagimp);
        System.out.println("Paginas restantes para imprimir: "+papel);
    }
    
}
