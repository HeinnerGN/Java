package ejerciciosjava;

import java.util.Scanner;

public class Imc {
    
    public Imc(){
        System.out.println("Ejercicio 7: IMC");
        System.out.println("");
        tomardatos();
    }
    
    public static void tomardatos(){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese su peso:");
        double peso=dato.nextDouble();
        System.out.println("Ingrese su altura:");
        double altura=dato.nextDouble();
        procesardatos(peso,altura);
    }
    
    public static void procesardatos(double peso, double altura){
        double imc=peso/(altura*altura);
        String categoria=null;
        if (imc<18.5){
            categoria="Bajo peso";
        }
        else if (imc<24.9){
            categoria="Peso normal";
        }
        else if (imc<29.9){
            categoria="Sobrepeso";
        }
        else if (imc>29.90){
            categoria="Obesidad";
        }
        
        switch(categoria){
            case "Bajo peso":
                System.out.println("Categoria: Bajo peso");
                break;
            case "Peso normal":
                System.out.println("Categoria: Peso");
                break;
            case "Sobrepeso":
                System.out.println("Categoria: Sobrepeso");
                break;
            case "Obesidad":
                System.out.println("Categoria: Obesidad");
                break;
            default:
                System.out.println("Error. Categoria desconocida");
                break;
        }
        mostrardatos(imc, categoria);
    }
        
        public static void mostrardatos(double imc, String categoria){
            System.out.println("Su IMC es: "+imc);
            System.out.println("Su categoria de IMC: "+categoria);
        }
}
