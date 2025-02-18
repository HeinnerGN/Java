package ejerciciosjava;

import java.util.Scanner;

public class Tienda {
    static int a=10000;
    static int v=50000;
    static int e=30000;
    
    public Tienda(){
        System.out.println("Ejercicio 6: Tienda");
        System.out.println("");
        tomardatos();
    }
    
    public static void tomardatos(){
        Scanner dato=new Scanner(System.in);
        System.out.println("Ingrese la letra para el producto de compra.");
        System.out.println("A: Alimentos.");
        System.out.println("V: Vestimenta");
        System.out.println("E: Electronicos");
        String valor=dato.nextLine();
        System.out.print("Ingrese la cantidad de compra:");
        int cantidad=dato.nextInt();
        procesardatos(valor,cantidad);
    }
    
    public static void procesardatos(String valor, int cantidad){
        int subtotal;
        int descuento;
        int total = 0;
        switch(valor){
            case "A":
                System.out.println("El precio del producto es "+a);
                subtotal=a*cantidad;
                descuento=(int)(subtotal*0.10);
                total=subtotal-descuento;
                break;
            case "V":
                System.out.println("El precio del producto es "+v);
                subtotal=v*cantidad;
                descuento=(int)(subtotal*0.05);
                total=subtotal-descuento;
                break;
            case "E":
                System.out.println("El precio del producto es: "+e);
                subtotal=e*cantidad;
                total=subtotal;
                break;
        }
        mostrardatos(total);
    }
    
    public static void mostrardatos(int total){
        System.out.println("El precio total de su compra es de "+total);
    }    
}
