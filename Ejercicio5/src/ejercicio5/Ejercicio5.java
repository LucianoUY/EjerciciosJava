/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        int doble = num*2;
        int triple = num*3;
        double raiz = Math.sqrt(num);
        System.out.println("El doble del número es: "+doble+", el triple es: "+triple+" y la raíz cuadrada es: "+raiz);
        
    }
    
}
