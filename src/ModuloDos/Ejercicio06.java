package ModuloDos;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a, b;

        System.out.print("Ingrese una letra: ");
        a =  sc.nextLine().toUpperCase().charAt(0);
        System.out.print("Ingrese otra letra: ");
        b =  sc.nextLine().toUpperCase().charAt(0);

        System.out.print("\n Letra \"" + a + "\" valor ASCII Mayusculas: " + ((int)a));
        System.out.print("\n Letra \"" + b + "\" valor ASCII Mayusculas: " + ((int)b));

        a = String.valueOf(a).toLowerCase().charAt(0);
        b =String.valueOf(b).toLowerCase().charAt(0);

        System.out.print("\n Letra \"" + a + "\" valor ASCII Minuscula: " + (int)a);
        System.out.print("\n Letra \"" + b + "\" valor ASCII Minuscula: " + (int)b);
    }
}
