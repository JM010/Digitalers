package ModuloTres;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        int temperatura;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cual es la temperatura actual: ");
        temperatura = sc.nextInt();

        if (temperatura>25) {
            System.out.println("Caminar y tomar sol");
        } else if (temperatura>15 && temperatura<=25) {
            System.out.println("Caminar");
        } else if (temperatura<=15 && temperatura>=10) {
            System.out.println("Caminar con campera");
        } else if (temperatura<10 && temperatura>0) {
            System.out.println("Quedarse en casa o salir con paraguas y campera");
        } else {
            System.out.println("Esquiar");
        }

    }
}
