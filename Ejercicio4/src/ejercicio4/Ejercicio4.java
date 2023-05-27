/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celsius");
        double tempC = leer.nextDouble();
        double tempF = 32 + (9 * tempC/5);
        System.out.println(tempC + "º C equivalen a " + tempF + "º F.");
        
    }
    
}
