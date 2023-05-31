/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
        int sum=0;
      int [] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]= (int)(Math.random()*100);
           
        }
        System.out.println("Ingrese un número a buscar en el vector");
        int buscar=leer.nextInt();
        for (int i = 0; i < n; i++) {
                    
            if (vector[i]==buscar) {
                sum=sum+1;
                System.out.println("El nùmero està en el vector: "+i+1);

            }
            
        }
        System.out.println("El número se repite "+sum+" veces.");
    }
    
}
