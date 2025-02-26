package ejerciciosjava;

import java.util.Scanner;

public class Biblioteca {
    static Scanner dato = new Scanner(System.in);
    
    public Biblioteca(){
        System.out.println("Ejercicio 17: Registro de Biblioteca");
        System.out.println("");
        registrarlibros();
    }
    
    public static void registrarlibros(){
        String listalibros = "";
        int opcion = 0;
        
        while(opcion == 0){
            System.out.println("Ingrese el titulo del libro:");
            String titulo = dato.nextLine();
            
            System.out.println("Ingrese el autor del libro:");
            String autor = dato.nextLine();
            
            System.out.println("Ingrese el numero de paginas del libro:");
            int paginas = dato.nextInt();
            dato.nextLine();
            
            
            listalibros += "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + paginas + "\n";
            
            System.out.println("Desea registrar otro libro?");
            System.out.println("1. Si");
            System.out.println("2. No");
            opcion = dato.nextInt();
            if(opcion==1){
                registrarlibros();
            }
            else if(opcion==2){
                System.out.println("Saliendo del programa");
                break;
            }
        }
        
        System.out.println("\nLista de libros registrados:");
        System.out.println(listalibros);
    }
    
}
