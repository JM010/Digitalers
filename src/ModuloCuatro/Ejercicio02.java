package ModuloCuatro;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hasta;
        System.out.println("Digite un numero: ");
        hasta = sc.nextInt();
        String arroba;

        for (int i = 1; i <= hasta; i++) {
         arroba = (i%2==0)? "@@":"@";
         System.out.println(arroba);
        }
    }
}
