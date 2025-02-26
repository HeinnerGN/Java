package ejerciciosjava;

import java.util.Scanner;

public class Parqueadero {
    static Scanner dato = new Scanner(System.in);
    static String placas = "";
    static String horasingreso = "";

    public Parqueadero() {
        System.out.println("Ejercicio 23: Registro de vehiculos en parqueadero");
        System.out.println("");
        procesardatos();
    }

    public static void tomardatos(int numeroVehiculos) {
        for (int i = 0; i < numeroVehiculos; i++) {
            System.out.println("Ingrese la placa del vehiculo " + (i + 1) + ":");
            String placa = dato.nextLine();
            System.out.println("Ingrese la hora en que ingreso el vehiculo " + (i + 1) + " (Horas/Minutos):");
            String horaIngreso = dato.nextLine();
            
            placas += "Vehículo " + (i + 1) + " - Placa: " + placa + "\n";
            horasingreso += "Hora de ingreso: " + horaIngreso + "\n\n";
        }
    }

    public static void procesardatos() {
        System.out.println("Cuantos vehiculos desea registrar en el parqueadero?");
        int numeroVehiculos = dato.nextInt();
        dato.nextLine();
        tomardatos(numeroVehiculos);
        mostrardatos();
    }

    public static void mostrardatos() {
        System.out.println("Vehiculos registrados:");
        if (placas.isEmpty()) {
            System.out.println("No se han registrado vehiculos.");
        } else {
            System.out.println(placas);
            System.out.println(horasingreso);
        }
    }
}
