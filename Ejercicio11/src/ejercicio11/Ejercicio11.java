/*
 MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese dos números enteros");
         int num1=leer.nextInt();
         int num2=leer.nextInt();
         int menu=0;
         String opcion="X";
         do {         
        
        
         System.out.println("MENU");
         System.out.println("1. Sumar");
         System.out.println("2. Restar");
         System.out.println("3. Multiplicar");
         System.out.println("4. Dividir");
         System.out.println("5. Salir");
         System.out.println("Elija opción:");
       menu=leer.nextInt();
         switch (menu) {
            case 1:
                int sum=num1+num2;
                System.out.println("La suma es: "+sum);
                break;
            case 2:
                int res=num1-num2;
                System.out.println("La resta es: "+res);
                break;
            case 3:
                int mul=num1*num2;
                System.out.println("La multiplicación es: "+mul);
                break;
            case 4:
                int div=num1/num2;
                System.out.println("La división es: "+div);
                break;
            case 5: 
                System.out.println("Està seguro que desea salir del programa?(S/N)");
                opcion=leer.next();
                if (opcion.equalsIgnoreCase("S")) {
                    menu=5;
                    break;
                    } else{
                    menu=6;
                }
            case 6:
                System.out.println("Eligió no salir");
                break;
            default:
               System.out.println("Ingrese una opción correcta");
     
    
    }
         } while (menu!=5);
         
    }
    }

