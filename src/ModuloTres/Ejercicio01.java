package ModuloTres;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String usuarioCorrecto = "jmroldan";
        String contraseñaCoreecta= "Casla_100";
        String usuraio, contraseña;

        System.out.print("Ingrese su nombre de usuario: ");
        usuraio = sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        contraseña = sc.nextLine();

        if (usuarioCorrecto.equalsIgnoreCase(usuraio) && contraseñaCoreecta.equals(contraseña)) {
            System.out.println("\t.:Bienvenido al sistema:.");
        } else {
            System.out.println("Error: credenciales incorrectas");
        }

    }
}
