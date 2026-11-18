/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        int contador = 1;
        int multiplicar = 1;
        int suma = 1;

        System.out.println("Ingrese el Límite");
        limite = entrada.nextInt(); // 6
        while (contador <= limite) {

            if (contador % 2 != 0) {
                multiplicar = multiplicar * contador;
            } else {

                contador = contador + 1;
            }

            System.out.printf("La suma de pares es %d\n", suma);
            System.out.printf("la  multiplicacion de los impares es %d\n", multiplicar);

        }
    }
}
    /*
La suma de los pares y la representacion de lo impares
     */
