/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String fraseMayus = frase.toUpperCase();
        String fraseMinus = frase.toLowerCase();
        System.out.println("La frase en mayúsculas es: " + fraseMayus);
        System.out.println("La frase en minúsculas es: "+ fraseMinus);
    }
    
}
