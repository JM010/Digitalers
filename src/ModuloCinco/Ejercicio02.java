package ModuloCinco;

import java.util.Scanner;

public class Ejercicio02 {

    static boolean esPrimoRec(int n, int divisor) {
        if (n <= 1) return false; // 0 y 1 no son primos
        if (divisor == 1) return true; // si ya pasamos todos los divisores
        if (divisor != n && n % divisor == 0) return false; // si encontramos otro divisor distinto de n
        return esPrimoRec(n, divisor - 1); // seguimos probando con el siguiente divisor
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int cantidad,maximo;
        int aleatorios[];

        System.out.print("Indique la cantidad de numeros aleatorios que quiere generar: ");
        cantidad = sc.nextInt();
        System.out.print("Indique el numero maximo a generar por cada aleatorio: ");
        maximo= sc.nextInt();

        aleatorios = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            aleatorios[i]=(int)(Math.random() * maximo) + 1;
        }

        for (int i = 0; i < aleatorios.length; i++) {

            if (esPrimoRec(aleatorios[i],aleatorios[i])) {
                System.out.println("El numero " + aleatorios[i] + " es primo");
            } else {
                System.out.println("El numero " + aleatorios[i] + " no es primo");
            }

        }
        System.out.print("[");
        for (int n : aleatorios) {
            System.out.print( n +", ");
        }
        System.out.print("]");

    }
}
