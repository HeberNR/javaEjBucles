package bucles;

import java.util.logging.Logger;

public class EjFor {

    public static final Logger LOG //al criar una constante con "final" el nombre de la constante debe ser en mayuscula
            = Logger.getLogger(EjFor.class.getName());

    public static void main(String[] args) {

        // usamos for cuando sabemos cuantas veces se itera
        // inicializacion; condicion; incremento

        for (int i = 0; i < 24; i++){
            LOG.info("Es la hora: " + i);
            if (i == 12) {
                LOG.info("Es hora del almuerzo");
            }
        } // cierra el for

        /*
        int j = 0;
        for ( ; j < 24 ;) {
            LOG.info("Es la hora: " + j);
            if ( j == 12 ){
                LOG.info("Es la hora de comer");
            }
            j++;
        }//cierra el for

        */

        for (int i = 0; i < 24; i++){
            LOG.info("Es la hora: " + i);
            if (i == 12) {
                LOG.info("Es hora del almuerzo");
                continue;
            }
            if ( i == 17){
                LOG.info("Es hora del té");
            }
        } // cierra el for

    }
}
