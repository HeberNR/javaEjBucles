package bucles;

import java.util.Scanner;
import java.util.logging.Logger;

public class EjDoWhile {

    //atributo de clase
    public static final Logger log =
            Logger.getLogger(EjDoWhile.class.getName());
                            //nombreDeMiClase.class.getName()

    //main es un metodo de la clase
    //void indica que la funcion llamada main no retorna nada
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String continuar;
        int cantIteraciones = 0;

        //ejecuta las instrucciones al menos 1 vez antes de evaluar la condicion
        do {
            cantIteraciones++;
            log.info("Bienvenido");
            log.warning("Ojo esta es una advertencia");
            log.severe("Aca paso algo grave");

            log.info("Esta es la iteracion numero: " + cantIteraciones);
            //System.out.println("Esta es la iteracion numero: " + cantIteraciones);
            System.out.println("Desea volver a ver el mensaje de bienvenida (si/no)");
            continuar = sc.next();

        } while (continuar.toLowerCase().equals("si"));


    }
}
