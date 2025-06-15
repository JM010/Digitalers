package ModuloCuatro;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasta;
        System.out.println("Digite un numero: ");
        hasta = sc.nextInt();
        String arroba="@";

        for (int i = 0; i < hasta; i++) {
            System.out.println(arroba);
            arroba+="@";
        }
        System.out.println();

        for (int i = 0; i < hasta; i++) {
            for (int j = hasta; j > i ; j--) {
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
