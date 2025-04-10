package bucles;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio2 {

    public static final Logger LOG
            = Logger.getLogger(Ejercicio2.class.getName());

    public static void main(String[] args) {

        /*
        2. Realizar un programa que indique usuario y  contraseña con un máximo de 3 intentos. Si supera la cantidad de intentos con datos
        inválidos: mostrar un mensaje indicando que  se ha bloqueado el usuario.
         */

        String usuarioCorrecto = "admin";
        String contraseñaCorrecta = "1234";
        int intentos = 0;
        boolean accesoConsedido = false;
        Scanner sc = new Scanner(System.in);

        while (intentos < 3 && !accesoConsedido){

            System.out.printf("Ingrese el usuario: ");
            String usuario = sc.nextLine();
            System.out.printf("Ingrese la contraseña: ");
            String contraseña = sc.nextLine();

            if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)){
                System.out.println("Sesion iniciada.");
                accesoConsedido = true;
            } else {
                intentos++;
                System.out.printf("Contraseña o usuario incorrecto. Intento " + intentos + " de 3\n");
            }

        }

        if (!accesoConsedido)
            System.out.println("Usuario bloqueado, maximo de intentos superado.");


    }
}
