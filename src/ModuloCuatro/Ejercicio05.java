package ModuloCuatro;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
//        Scanner sc =  new Scanner(System.in);
//        int cantidadInicial;
//        System.out.print("Digite la cantidad");
//        cantidadInicial = sc.nextInt();

        int cantInicial=5;
        int cantMedia=1;
        int incremento=-2;
        int cantFinal=cantInicial-incremento;
        int cantArrobas=0;
        int cantArrobasLinea=cantInicial;
        int contadorLineas=0;
        while(cantArrobasLinea!=cantFinal || contadorLineas==0){
            for(cantArrobas=1;cantArrobas<=cantArrobasLinea;cantArrobas++){
                System.out.print("@");
            }
            System.out.println();
            cantArrobasLinea+=incremento;
            if(cantArrobasLinea==cantMedia){
                incremento=-incremento;
            }
            contadorLineas++;
        }

    }
}
