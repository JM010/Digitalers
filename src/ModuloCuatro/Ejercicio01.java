package ModuloCuatro;

public class Ejercicio01 {
    public static void main(String[] args) {

        String oracion = "bobolon";
        char[] caracteres = oracion.toCharArray();

        char masRepetido = ' ';
        int maxCantidad = 0;

        for (int i = 0; i < caracteres.length; i++) {
            char actual = caracteres[i];
            int contador = 0;

            // Si ya lo procesamos, lo salteamos
            if (actual == '0') {
                continue;
            }

            // Contamos cuántas veces aparece el carácter actual
            for (int j = 0; j < caracteres.length; j++) {
                if (caracteres[j] == actual) {
                    contador++;
                }
            }

            // Si este carácter se repite más que el anterior, lo guardamos
            if (contador > maxCantidad) {
                maxCantidad = contador;
                masRepetido = actual;
            }

            // Marcamos este carácter como ya procesado
            for (int j = 0; j < caracteres.length; j++) {
                if (caracteres[j] == actual) {
                    caracteres[j] = '0'; // Usamos '0' como marcador
                }
            }
        }

        System.out.println("El carácter que más se repite es '" + masRepetido + "' con " + maxCantidad + " repeticiones.");
    }

}

