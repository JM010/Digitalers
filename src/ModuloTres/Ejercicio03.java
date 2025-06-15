package ModuloTres;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int opcion;

        System.out.println("\t.:Menu:.");
        System.out.println("1.Documentacion");
        System.out.println("2.Cotizacion");
        System.out.println("3.Asistencia");
        System.out.println("4.Siniestros");
        System.out.println("5.Informacion de pago");
        System.out.println("6.Otras consultas");
        System.out.println("7.Anulacion");
        System.out.print("Eliga una opcion: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
                System.out.println("Ha seleccionado Documentacion");
            break;
            case 2:
                System.out.println("Ha seleccionado Cotizacion");
            break;
            case 3:
                System.out.println("Ha seleccionado Asistencia");
            break;
            case 4:
                System.out.println("Ha seleccionado Siniestros");
            break;
            case 5:
                System.out.println("Ha seleccionado Siniestros Informacion de pago");
            break;

            case 6:
                System.out.println("Ha seleccionado Siniestros Otras consultas");
            break;
            case 7:
                System.out.println("Ha seleccionado Siniestros Anulacion");
            break;
            default:
                System.out.println("La opcion ingresada no existe");
            break;
        }
    }
}
