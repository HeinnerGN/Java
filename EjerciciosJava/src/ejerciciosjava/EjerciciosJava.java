package ejerciciosjava;
import java.util.Scanner;

public class EjerciciosJava {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 a 30 para ver los ejercicios:");
   
        int opcion = teclado.nextInt();
        if (opcion > 0 && opcion <= 30){
            if (opcion == 1) {Ascensor objAscensor = new Ascensor();
            objAscensor.tomardatos();}
            if (opcion == 2) {Ascensor_peso objAscensor_peso = new Ascensor_peso();
            objAscensor_peso.tomardatos();}
            if (opcion == 3) {Temperatura objTemperatura = new Temperatura();}
            if (opcion == 4) {Umbral_alerta objAlerta = new Umbral_alerta();
            objAlerta.tomardatos();}
            if (opcion == 5) {Combinacion objCombinacion = new Combinacion();}
            if (opcion == 6) {Tienda objTienda = new Tienda();}
            if (opcion == 7) {Imc objImc = new Imc();}
            if (opcion == 8) {Cine objCine = new Cine();}
            if (opcion == 9) {Clasificacion objClasificacion = new Clasificacion();}
            if (opcion == 10) {Menu objMenu = new Menu();}
            if (opcion == 11) {Cajero_automatico objCajero = new Cajero_automatico();}
            if (opcion == 12) {Compra_tienda tienda = new Compra_tienda(); tienda.Compra_tienda();}
            if (opcion == 13) {Impresora objImpresora = new Impresora();}
            if (opcion == 14) {Viaje_coche Viaje = new Viaje_coche(); Viaje.Viaje_coche();}
            if (opcion == 15) {Cuenta_regresiva cuenta = new Cuenta_regresiva(); cuenta.Cuenta_regresiva();}
            if (opcion == 16) {Adivinanza objAdivinanza = new Adivinanza();}
            if (opcion == 17) {Biblioteca objBilbioteca = new Biblioteca();}
            if (opcion == 18) {Menu_comidas objMenu = new Menu_comidas();}
            if (opcion == 19) {Sensor_temp objTemp = new Sensor_temp();}
            if (opcion == 20) {Examenes objExamenes = new Examenes();}
            if (opcion == 21) {Gestion_tareas objGestion = new Gestion_tareas();}
            if (opcion == 22) {Registro_ventas objVentas = new Registro_ventas();}
            if (opcion == 23) {Parqueadero objparquear = new Parqueadero();}
            if (opcion == 24) {Tienda_virtual objVirtual = new Tienda_virtual();}
            if (opcion == 25) {Agenda_contactos objAgenda = new Agenda_contactos();}
            if (opcion == 26) {Lista_numeros objlista = new Lista_numeros();}
            if (opcion == 27) {Ventas objventas = new Ventas();}
        }
        else{
            System.out.println("Error, numero no valido."
                    + "Vuelva a ingresar un numero de 1 a 30.");
            teclado.nextLine();
        }
    }
}