
package taller_3;

import java.util.Scanner;


public class PUNTO_XI_PARTE_2 {
public static void main(String args[]){  
    System.out.println("**PROGRAMA PARA INVERTIR NUMEROS ENTEROS*");
    Scanner entrada = new Scanner(System.in);
    int num;
    PUNTO_XI miObjeto = new PUNTO_XI();

    System.out.println("Por favor introduzca un numero entero:  ");
    num = entrada.nextInt();

    System.out.println("\nA continuacion el numero ingresado invertido: \n ");
    miObjeto.Invierte(num);

 
 }   
}
