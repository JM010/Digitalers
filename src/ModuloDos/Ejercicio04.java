package ModuloDos;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String texto[],nombre, apellido;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        texto = nombre.split("\\s+");

        if (texto.length >=2) {
            nombre = texto[0];
            apellido =  texto[1];

            System.out.println("Nombre: " + nombre.substring(0,1).toUpperCase() + nombre.substring(1) );
            System.out.println("Apellido: " + apellido.substring(0,1).toUpperCase() + apellido.substring(1) );
        } else {
            System.out.println("El formano es incorrecto");
        }



    }
}
