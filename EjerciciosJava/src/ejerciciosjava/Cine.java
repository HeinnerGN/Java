package ejerciciosjava;

import java.util.Scanner;

public class Cine {
    
    public Cine(){
        System.out.println("Ejercicio 8: Cine");
        System.out.println("");
        tomardatos();
    }
    
    public static void tomardatos(){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad=dato.nextInt();
        procesardatos(edad);
    }
    
    public static void procesardatos(int edad){
        String resultado=null;
        if(edad<7){
            resultado="Niños";
        }
        else if(edad>=7 && edad<=17){
            resultado="Niños y Adolescentes";
        }
        else if(edad>17 && edad<31){
            resultado="Adultos";
        }
        else if(edad>30){
            resultado="Personas Mayores";
        }
        
        switch(resultado){
            case "Niños":
                System.out.println("Se recomienda peliculas animadas y educativas aptas para todas las edades.");
                break;
            case "Niños y Adoslecentes":
                System.out.println("Se recomienda peliculas animadas, aventuras y comedias familiares.");
                break;
            case "Adultos":
                System.out.println("Se recomienda una variedad de peliculas de generos, accion, drama, comedia y ciencia ficcion ");
                break;
            case "Personas Mayores":
                System.out.println("Se recomienda peliculas clasicas y dramas que puede ser de su interes.");
                break;
            default:
                System.out.println("Datos invalidos.");
                break;
        }
        mostrardatos(resultado);
    }
    
    public static void mostrardatos(String resultado){
        System.out.println("Disfrute de sus peliculas.");
    }
    
}
