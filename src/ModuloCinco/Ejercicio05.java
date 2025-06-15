package ModuloCinco;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ejercicio05 {

    static boolean esPalindromo(String palabra) {
        String limpia = palabra.trim().toLowerCase();
        int n = limpia.length();

        for (int i = 0; i < n / 2; i++) {
            if (limpia.charAt(i) != limpia.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

   static boolean esCapicua(int numero) {
        String num = String.valueOf(numero);
        int n = num.length();

       for (int i = 0; i < n/2; i++) {
           if (num.charAt(i) != num.charAt(n-1-i)) {
                return false;
           }
       }

       return true;
   }


    public static void main(String[] args) {
        String palabra = "reconocer";
        int numero =11011;
        String esPalindromo =  esPalindromo(palabra) ? palabra + " es palindromo" : palabra + " no es palindromo";
        String esCapicua = esCapicua(numero) ? numero + " es capicua": numero + " no es capicua";

        System.out.println(esPalindromo);
        System.out.println(esCapicua);

    }
}
