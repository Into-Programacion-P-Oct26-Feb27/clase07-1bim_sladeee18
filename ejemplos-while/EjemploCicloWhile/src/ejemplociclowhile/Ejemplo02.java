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
public class Ejemplo02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        int contador = 1;
        System.out.println("Ingrese el Límite"); 
        limite = entrada.nextInt(); // 6
        while (contador <= limite){
            
            if (contador%2!=0) {
                System.out.printf("Contador %d\n", 
                    contador);
                suma = suma + contador ;
            }
            
            contador = contador + 1;
        }
        System.out.printf("La suma de impares es %d\n", suma);
    }
}
/*
Generar un progama que me permita ingresar un limite por teclado y presentar la
suma de todos los numero impares que exitan en 1 - limite
*/