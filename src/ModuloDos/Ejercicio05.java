package ModuloDos;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1,n2;
        int decimales;
        System.out.print("Ingrese un numero: ");
        n1 = sc.nextFloat();
        System.out.print("\nIngrese otro numero: ");
        n2= sc.nextFloat();
        System.out.print("\nIngrese la cantidad de decimales que desa ver: ");
        decimales = sc.nextInt();

        String formato = "%." + decimales +"f";

        System.out.printf("\nNumero uno: " + formato + "%n", n1);
        System.out.printf("\nNumero dos: " + formato + "%n", n2);
        System.out.printf("\nNumero dos: " + formato + "%n", Math.pow(n1,n2));
    }
}
