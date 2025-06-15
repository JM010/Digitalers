package ModuloDos;

import java.util.Scanner;

public class Ejercici01 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        float n1,n2;
        System.out.print("ingrese el primer numero : ");
        n1 = sc.nextFloat();
        System.out.print("ingrese el segundo numero: ");
        n2 = sc.nextFloat();

        double suma =  (double) n1 + n2;
        double resta = (double) n1 - n2;
        double div =(double) n1 /n2;
        double mult = (double) n1*n2;

        System.out.printf("Suma doble precision: %.20f", suma);
        System.out.printf("\nResta doble precision : %.20f", resta);
        System.out.printf("\nDivicion doble precision: %.20f", div);
        System.out.printf("\nMultiplicacion doble precision: %.20f", mult);
        System.out.println("\n");
        System.out.println("Suma sin decimal : " + (int)suma);
        System.out.println("Resta sin decimal : " + (int)resta);
        System.out.println("Divicion sin decimal : " + (int)div);
        System.out.println("Multiplicacion sin decimal : " + (int)mult);
    }
}
