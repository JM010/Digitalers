package ModuloCinco;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        float n1,n2;
        char option;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        n1 =  sc.nextFloat();
        System.out.print("Ingrese otro numero: ");
        n2 =  sc.nextFloat();

        do {
            System.out.print("Ingrese la operacion que desea realizar: ");
            option = sc.next().charAt(0);

        }while (option != '+' && option != '-' && option != '*' && option != '/' && option != '%');

        operacion(n1,n2,option);

    }



    static void operacion (float n1, float n2, char opcion) {
        if (opcion == '+') {
            System.out.print( n1 + " + " + n2  + " = " + (n1+n2));
        } else if (opcion == '-')  {
            System.out.print( n1 + " - " + n2  + " = " + (n1-n2));
        } else if (opcion == '*') {
            System.out.print( n1 + " * " + n2  + " = " + (n1*n2));
        }else if (opcion == '/') {
            System.out.print( n1 + " / " + n2  + " = " + (n1/n2));
        }else if (opcion == '%') {
            System.out.print( n1 + " % " + n2  + " = " + (n1%n2));
        }
    }


}
