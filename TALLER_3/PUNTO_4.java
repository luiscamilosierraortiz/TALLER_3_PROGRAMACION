
package taller_3;

import java.util.Scanner;


public class PUNTO_4 {
public static void main(String[] args) {
        System.out.println(" CALCULAR EL SUELDO DE EMPLEADOS");
        int con, acu,canhr,prchr,hsem,hext=0,slbt;
        Scanner leer = new Scanner(System.in);
        System.out.println(" digite el numero de empleados: ");
        con=leer.nextInt();
        for (int i = 0; i <con; i++) {
            acu=+1;
            System.out.println(" digite las horas laboradas a la semana por el empleado "+(i+1)+":");
            canhr=leer.nextInt();
            System.out.println(" digite el costo de la hora laboral:");
            prchr=leer.nextInt();
            if (canhr>40) {
            hsem=canhr-40;
            hext=(int)(float)( hsem*prchr*1.5);           
            slbt= hext+(40*prchr);
            System.out.println("El sueldo Bruto semanal es: "+slbt);
           
            }    
            else{
            slbt=canhr*prchr;
            System.out.println("El sueldo Bruto semanal es: "+slbt);
            }      
        }
        
    }   
}
