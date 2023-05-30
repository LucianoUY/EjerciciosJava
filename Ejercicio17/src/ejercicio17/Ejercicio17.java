/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio17;

/**
 *
 * @author lucho
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        vector[0]=1;
        vector[1]=2;
        vector[2]=10;
        vector[3]=111;
        vector[4]=1124;
        vector[5]=12342;
        vector[6]=134432;
        vector[7]=123;
        vector[8]=4444;
        vector[9]=1234;
        int unac=0;
        int dosc=0;
        int trec=0;
        int cuac=0;
        int cinc=0;
        for (int i = 0; i < 10; i++) {
            if (vector[i]/10000>=1 && vector[i]/10000<10) {
                cinc=cinc+1;
                }
            if (vector[i]/1000>=1 && vector[i]/1000<10) {
                cuac=cuac+1;
                }
            if (vector[i]/100>=1 && vector[i]/100<10) {
                trec=trec+1;
            }
            if (vector[i]/10>=1 && vector[i]/10<10) {
                dosc=dosc+1;                
            }
            if (vector[i]>=0 && vector[i]<10) {
                unac=unac+1;                
            }
        }
        System.out.println("El vector tiene " +unac+" números de una cifra, "+dosc+" números de dos cifras, "+trec+" números de tres cifras, "+cuac+" números de cuatro cifras y "+cinc+" números de cinco cifras.");
        
    }
    
}
