package ModuloTres;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer clave = (int) (Math.random() * 900000) + 100000;
        int intentos = 0;

         menu(intentos, sc, clave);
    }

    public static void menu(int intentos, Scanner sc, Integer clave) {
        intentos++;
        System.out.println("\u001B[32mBienvenidos a Online Banking, por favor ingrese las credenciales " +
                "solicitadas: ");
        System.out.println("\u001B[34mClave token generada Automaticamente: \u001B[32m" + clave);
        String miUsuario = fillStringDate("\u001B[34mUsuario: \u001B[32m",sc);
        String miContraseña = fillStringDate("\u001B[34mcontraseña: \u001B[32m",sc);
        Integer miClave = fillIntegerDate("\u001B[34mCalve: \u001B[32m",sc);
        sc.nextLine();

        Boolean isLoginTrue = login(miUsuario,miContraseña,miClave,clave);

        if (intentos>=3) {
            System.out.println("\u001B[31mError de Credenciales... \u001B[0m Usuario bloqueado, " +
                    "por favor dirijase a la sucursal mas cercana");
        } else if(isLoginTrue) {
            System.out.println("\u001B[32mCredenciales correctas, Bienvenido a su Online Backing");
        }else {
            System.out.print("\u001B[31mError de Credenciales... \u001B[0m ¿Desea intentarlo de nuevo? (S/N): ");
            char opcion = sc.nextLine().toLowerCase().charAt(0);
            if (!(opcion == 's')) {
                System.out.println("Gracias por utilizar Online backing");
            }else {
                menu(intentos,sc,clave);
            }
        }
    }
    public static boolean login(String inputUser,String passUser,Integer token, Integer validToken) {
        String usuario = "administrador";
        String contraseña = "administrador.1234";

        Boolean isValidToken= validToken.equals(token);
        Boolean isValidUser = usuario.equalsIgnoreCase(inputUser);
        Boolean isValidPass = contraseña.equals(passUser);

        return isValidPass && isValidToken && isValidUser;
    }
    public static String fillStringDate(String message, Scanner leer) {
        System.out.print(message);
        return leer.nextLine();
    }

    public static int fillIntegerDate(String message, Scanner leer) {
        System.out.print(message);
        return leer.nextInt();
    }

}