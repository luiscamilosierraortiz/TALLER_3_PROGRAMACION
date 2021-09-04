
package taller_3;

import java.util.Scanner;


public class PUNTO_7 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Favor Digite cantidad de numeros: ");
        int cont=sc.nextInt();
        
        int M=0;
        
        for (int i = 0; i < cont; i++) {
            System.out.println("Digite numero"+(i+1));
            int numero=sc.nextInt();
            
            if(i==0){
                M=numero;
                
            }else if(numero>M){
            M=numero;
            }
        }
        System.out.println("El numero Mayor es: "+ M);
        
    }
}   

