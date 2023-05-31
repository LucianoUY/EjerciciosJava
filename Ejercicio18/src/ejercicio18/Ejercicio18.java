/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

/**
 *
 * @author lucho
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] vector = new int[4][4];
         for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
                 vector[i][j]= (int)(Math.random()*10);                
                 
             }
        }
         for (int i = 0; i < 4; i++) {
             System.out.println("");
             for (int j = 0; j < 4; j++) {
                 System.out.print(vector[j][i]);
             }
             
            
        }
         for (int i = 0; i < 4; i++) {
             System.out.println("");
             for (int j = 0; j < 4; j++) {
                 System.out.print(vector[i][j]);
             }
    }
         
}
}