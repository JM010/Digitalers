package ModuloDos;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String parrafo1,parrafo2;

        System.out.print("Ingrese un parrafo: ");
        parrafo1 = sc.nextLine();
        System.out.print("Ingrese otro parrafo: ");
        parrafo2 = sc.nextLine();
        System.out.print("\nSon iguales bit a bit? : " + (parrafo1==parrafo2));
        System.out.print("\nSon iguales en contenido: " + parrafo1.equalsIgnoreCase(parrafo2));

        System.out.println("\nParrafos en mayusculas: ");
        System.out.println(parrafo1.toUpperCase());
        System.out.println(parrafo2.toUpperCase());

        System.out.println("\nParrafos en minusculas: ");
        System.out.println(parrafo1.toLowerCase());
        System.out.println(parrafo2.toLowerCase());

        System.out.println("\nPrimera letra en mayusculas: ");
        System.out.println(parrafo1.substring(0,1).toUpperCase() + parrafo1.substring(1));
        System.out.println(parrafo2.substring(0,1).toUpperCase() + parrafo2.substring(1));

        System.out.println("\nPrimera letra en minusculas: ");
        System.out.println(parrafo1.substring(0,1) + parrafo1.substring(1).toUpperCase());
        System.out.println(parrafo2.substring(0,1) + parrafo2.substring(1).toUpperCase());

        System.out.println("\nParrafos unidos: ");
        System.out.println(String.join(",",parrafo1,parrafo2 ));

    }
}
