/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

/**
 *
 * @author lucho
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     boolean estaContenida;
        
        int[][] matrizContenedora = {
            { 1, 26, 36, 47,  5,  6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90,  9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79,  1, 36,  5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 97, 90, 67, 12, 41, 65, 12}
        };
        int[][] matrizBuscada = {
            {36,  5, 67},
            {89, 90, 75},
            {14, 22, 26}
        };
        
        estaContenida = buscarMatrizEnMatriz(matrizBuscada, matrizContenedora);
        
        if(estaContenida)
            System.out.println("La matriz buscada fue encontrada en la contenedora");
        else 
            System.out.println("La matriz buscada NO ESTA PRESENTE en la contenedora");
        
    
    }
 private static boolean buscarMatrizEnMatriz(int[][] matrizBuscada, int[][] matrizContenedora) {
        int cantFilasContenedora = matrizContenedora.length; 
        int cantColumnasContenedora = matrizContenedora[0].length;
        
        int cantFilasBuscada = matrizBuscada.length; 
        int cantColumnasBuscada = matrizBuscada[0].length;
        
        boolean matrizEncontrada;
        
        
        for (int i = 0; i < cantFilasContenedora - cantFilasBuscada; i++) {
            for (int j = 0; j < cantColumnasContenedora - cantColumnasBuscada; j++) {
                if(matrizBuscada[0][0] == matrizContenedora[i][j]) {
                    //System.out.println("Se analizara en ["+i+"]["+j+"]");
                    matrizEncontrada = analizarCoincidencia(matrizBuscada, matrizContenedora, i, j);
                    
                    if(matrizEncontrada)
                        return true;
                }
            }
            
        }
        return false;
    }
  private static boolean analizarCoincidencia(int[][] matrizBuscada, int[][] matrizContenedora, int filaPorAnalizar, int columnaPorAnalizar) {
        int cantFilasBuscada = matrizBuscada.length; 
        int cantColumnasBuscada = matrizBuscada[0].length;
        
        for (int i = filaPorAnalizar; i < cantFilasBuscada + filaPorAnalizar; i++) {
            for (int j = columnaPorAnalizar; j < cantColumnasBuscada + columnaPorAnalizar; j++) {
                int valorMatrizContenedora = matrizContenedora[i][j];
                int valorMatrizBuscada = matrizBuscada[i-filaPorAnalizar][j-columnaPorAnalizar];
                
                if(valorMatrizContenedora != valorMatrizBuscada)
                    return false;
                
            }
        }
        return true;
    }
    
    
}