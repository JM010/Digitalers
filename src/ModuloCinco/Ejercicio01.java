package ModuloCinco;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int contador;
        boolean repetidas = false;
        String palabra;

        do {
            System.out.print("Ingrese la oracion a evalurar: ");
            palabra= sc.nextLine();

            if (palabra.length()==0) {
                System.out.println("¡La oracion no puede estar vacia!");
            }

        }while (palabra.length()==0);

       String palabras []= palabra.trim().split(" ");
       char letras []= palabra.replaceAll("\\s+", "").toCharArray();
       Arrays.sort(letras);
       contador =  palabras.length;

        for (int i = 0; i < palabras.length-1; i++) {
            if (palabras[i].equalsIgnoreCase(palabras[i+1])) {
                repetidas = true;
            }
        }
        System.out.println("cantidad de palabras: " + contador);
        if (repetidas){
            System.out.println("Hay palabras repetidas");
        } else {
            System.out.println("No hay palabras repetidas");
        }
        Arrays.sort(palabras);
        System.out.println("Palabras ordenadas: ");
        System.out.print("[");
        for (String p: palabras) {
            System.out.print(p + ", ");
        }
        System.out.print("]");

        System.out.println("Letras ordenadas: ");
        System.out.print("[");
        for (char l: letras) {
            System.out.print(l + ", ");
        }
        System.out.print("]");
    }
}
