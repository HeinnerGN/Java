package ejerciciosjava;

import java.util.Scanner;

public class Clasificacion {
    
    public Clasificacion(){
        System.out.println("Ejercicio 9: Campeonato Deportivo");
        System.out.println("");
        tomardatos();
    }
    
    public static void tomardatos(){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese un numero segun el resultado del partido 3(ganado), 0(perdido), 1(empetado)");
        int info = dato.nextInt();
        procesardatos(info);
    }
    
    public static void procesardatos(int info){
        int G=3;
        int E=1;
        int P=0;
        String resultado=null;
        
        if(info==G){
            resultado="ganado";
        }
        else if(info==E){
            resultado="empatado";
        }
        else if(info==P){
            resultado="perdido";
        }
        
        switch(resultado){
            case "ganado":
                System.out.println("El equipo ha ganado el partido y obtiene "+G+" puntos." );
                break;
            case "empatado":
                System.out.println("El equipo ha empatado y obtiene "+E+" punto.");
                break;
            case "perdido":
                System.out.println("El equipo ha perdido, no obtiene ningun punto.");
                break;
        }
        mostrardatos(resultado);
    }
    
    public static void mostrardatos(String resultado){
        System.out.println("Esta es la clasificacion de equipos:");
    }
}
