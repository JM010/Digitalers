package ModuloCuatro;

public class Ejercicio04 {
    public static void main(String[] args) {
        int cantInicial=1;
        int cantMedia=4;
        int incremento=1;
        int cantFinal=cantInicial-incremento;
        int cantArrobas=0;
        int cantArrobasLinea=cantInicial;
        int contadorLineas=0;
        while(cantArrobasLinea!=cantFinal || contadorLineas==0) {
            for (cantArrobas = 1; cantArrobas <= cantArrobasLinea; cantArrobas++) {
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
