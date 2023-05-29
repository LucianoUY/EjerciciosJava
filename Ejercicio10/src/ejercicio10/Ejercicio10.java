/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para usarlo como límite");
        int lim = leer.nextInt();
        int sum, num;
        sum=0;
        do {
            System.out.println("Ingrese un número para sumar");
            num=leer.nextInt();
            sum=sum+num;
        } while (sum<lim);
        
    }
    
}
