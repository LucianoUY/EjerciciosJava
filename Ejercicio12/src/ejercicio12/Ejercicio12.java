/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         String cadena;
         int err, corr;
         err=-1;
         corr=0;
         do {
            System.out.println("Ingrese una cadena de 5 caracteres");
            cadena=leer.next();
            int largo = cadena.length();
            String ult=cadena.substring(4, 5);
            String pri=cadena.substring(0, 1);
             if (largo==5 && pri.equals("X") && ult.equals("O") ) {
                   corr=corr+1;        
                 
                 
             } else {
                 err=err+1;
               
                   
             }
         
            
        } while (!cadena.equals("&&&&&"));
        
        System.out.println("Se registraron "+corr+" lecturas correctas. Y "+err+" lecturas erròneas");
        
    }
    
}
