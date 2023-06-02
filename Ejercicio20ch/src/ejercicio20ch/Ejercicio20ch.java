package ejercicio20ch;

import java.util.Scanner;

public class Ejercicio20ch {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] cM = new int[3][3];
        boolean cMV = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cM[i][j] = leer.nextInt();
            }
        }

        int sumaObjetivo = cM[0][0] + cM[0][1] + cM[0][2];
        for (int i = 1; i < 3; i++) {
            int sumaFila = cM[i][0] + cM[i][1] + cM[i][2];
            if (sumaFila != sumaObjetivo) {
                cMV = false;
            }
        }

        for (int j = 0; j < 3; j++) {
            int sumaColumna = cM[0][j] + cM[1][j] + cM[2][j];
            if (sumaColumna != sumaObjetivo) {
                cMV = false;
            }
        }

        int sumaDiagonal1 = cM[0][0] + cM[1][1] + cM[2][2];
        int sumaDiagonal2 = cM[0][2] + cM[1][1] + cM[2][0];
        if (sumaDiagonal1 != sumaObjetivo || sumaDiagonal2 != sumaObjetivo) {
            cMV = false;
        }

        if (cMV == false) {
            System.out.println("No es un cuadrado mágico");
        } else {
            System.out.println("Es un cuadrado mágico");
        }
    }
}