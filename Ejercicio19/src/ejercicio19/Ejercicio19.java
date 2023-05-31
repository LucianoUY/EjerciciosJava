/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio19;
import java.util.Random;
/**
 *
 * @author lucho
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int [][] matrizA = new int[3][3];
     int [][] matrizB = new int[3][3];
     boolean simetrica = false;
      Random random = new Random();
         for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
                 matrizA[i][j] = random.nextInt(21)-10;   
             }
      
        }
         for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               matrizB[i][j] = random.nextInt(21)-10;   
             }
        }
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               if (matrizA[i][j]==matrizB[j][i]*-1) {
                   simetrica=true;
                
               }else simetrica=false;
                   
               }
           }
       for (int i = 0; i < 3; i++) {
           System.out.println("");
           for (int j = 0; j < 3; j++) {
               System.out.print(matrizA[i][j]+" ");
               
           }
           System.out.println("");
           }
       for (int i = 0; i < 3; i++) {
           System.out.println("");
           for (int j = 0; j < 3; j++) {
               System.out.print(matrizB[j][i]+" ");
               
           }
           System.out.println("");
        
           }
        System.out.println("");
        System.out.println("Antisimetría: "+simetrica);
    }
    
}
