package bucles;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio1 {

    public static final Logger LOG =
            Logger.getLogger(Ejercicio1.class.getName());

    public static void main(String[] args) {

        /*
        1. Realizar un programa que genere un número aleatorio, entre 1 y 10, y le pida al usuario que adivine el número,
        sin límite de intentos.
        Ayuda: para generar el nro:  (int)(Math.random() * 10 + 1);
         */

        int nroRandom = (int)(Math.random() * 10 + 1);
        Scanner sc = new Scanner(System.in);
        int nroIngresado;

        do {
            LOG.info("Intente adivinar el número generado entre 1 y 10.");
            System.out.println("Ingrese un número: ");
            nroIngresado = sc.nextInt();

        } while (nroRandom != nroIngresado);

        LOG.info("¡Adivinaste el número! El número correcto era: " + nroRandom);

    }
}
