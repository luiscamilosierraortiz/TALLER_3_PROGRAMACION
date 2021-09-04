
package taller_3;

import java.util.Scanner;


public class PUNTO_8 {
 public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
       
        System.out.print(" Digite tamaño del cuadrado entre los rangos 1 y 20: ");
        int n = teclado.nextInt();
       
        if(n >= 0 && n<=20) {
            
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
           
         
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
          
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }else {
            System.out.println("Fuera de rango");
        }
               
 
    }
}   
    

