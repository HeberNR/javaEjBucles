package bucles;

import java.util.Scanner;
import java.util.logging.Logger;

public class Lab01_IngresarUsuario2 {

    public static final Logger LOG
            = Logger.getLogger(Lab01_IngresarUsuario2.class.getName());

    public static void main(String[] args) {

        String usuarioCorrecto = "admin";
        String contraseñaCorrecta = "1234";
        int intentos = 0;
        boolean accesoConsedido = false;
        Scanner sc = new Scanner(System.in);
        String colorFav = "rojo";
        String color;
        byte intentoPregunta = 0;

        while (intentos < 3 && !accesoConsedido){

            System.out.println("Ingrese el usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Ingrese la contraseña: ");
            String contraseña = sc.nextLine();

            if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)){
                accesoConsedido = true;

                do {
                    System.out.println("Cual es su color favorito?");
                    color = sc.next();
                    if(color.toLowerCase().equals(colorFav)) {
                        System.out.println("Respuesta correcta! Sesion iniciada.");
                        break;
                    } else{
                        intentoPregunta++;
                        System.out.printf("Respuesta incorrecta. Vuelva a intentarlo, le quedan " + intentoPregunta + " intentos.\n");
                    }
                } while (!color.toLowerCase().equals(colorFav) && intentoPregunta < 2);

            } else {
                intentos++;
                System.out.printf("Contraseña o usuario incorrecto. Intento " + intentos + " de 3\n");
            }

        }

        if (!accesoConsedido)
            System.out.println("Usuario bloqueado, maximo de intentos superado.");




    }

}


