package bucles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String continuar = "si";
        int cantIteraciones = 0;

        // sintaxis: While(predicado o condicion) {}

        //while(continuar.equals("si") || continuar.equals("Si") || continuar.equals("SI")) {
        // equals compara igualdad de strings
        // toLowerCase pasa el string a minuscula
        // toUpperCase pasa a mayuscula

        while (continuar.toLowerCase().equals("si")){
            cantIteraciones++;
            System.out.println("Bienvendio");
            System.out.println("Esta es la iteracion: " + cantIteraciones);

            System.out.println("Desea continuar (si/no)?");
            continuar = sc.next();
        }





    }
}