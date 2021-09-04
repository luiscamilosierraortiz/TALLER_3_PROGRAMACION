
package taller_3;

import java.util.Scanner;


public class PUNTO_9 {
public void P9EJECUTAR() {
         System.out.println("*PROGRAMA DE TIENDA DE PRODUCTOS*");
        Scanner leer=new Scanner(System.in);
        float CTL,TLV=0;
        int OP,CANT;
    
        System.out.print("\n**MENU DE PRODUCTOS***");
        System.out.println("\n*******PRECIOS**:");
        System.out.println("\n1. PRODUCTO*** $2.98");
        System.out.println("\n2. PRODUCTO***$4.50");
        System.out.println("\n3. PRODUCTO***$9.98");
        System.out.println("\n4. PRODUCTO***$4.49");
        System.out.println("\n5. PRODUCTO***$6.87\n");

        System.out.println("\n***POR FAVOR INGRESE UNA OPCION:");
        System.out.println("*OPRIMA (0) PARA TERMINAR*");
        OP= leer.nextInt(); 

        while (0!=OP)
        {       
        switch (OP)
        {   
        case 1 ->   {   
        System.out.print("\nPOR FAVOR DIGITE LA CANTIDAD DE PRODUCTOS VENDIDOS:");
        CANT = leer.nextInt();
        System.out.printf("\nPRECIO DE VENTA: %f", CANT*2.98);
        TLV+= CANT*2.98;
        }
        case 2 ->   {  
        System.out.print("\nPOR FAVOR DIGITE LA CANTIDAD DE PRODUCTOS VENDIDOS:");
        CANT = leer.nextInt();
        System.out.printf("\nPRECIO DE VENTA: %f", CANT*4.50);
        TLV += CANT*4.50;
        }  
        case 3 ->   {   
        System.out.print("\nPOR FAVOR DIGITE LA CANTIDAD DE PRODUCTOS VENDIDOS:");
        CANT = leer.nextInt();
        System.out.printf("\nPRECIO DE VENTA: %f", CANT*9.98);
        TLV+= CANT*9.98;
        }  
        case 4 ->   {    
        System.out.print("\nPOR FAVOR DIGITE LA CANTIDAD DE PRODUCTOS VENDIDOS:");
        CANT = leer.nextInt();
        System.out.printf("\nPRECIO DE VENTA: %f", CANT*4.49);
        TLV += CANT*4.49;
        }  
        case 5 ->   {    
        System.out.print("\nPOR FAVOR DIGITE LA CANTIDAD DE PRODUCTOS VENDIDOS:");
        CANT = leer.nextInt();
        System.out.printf("\nPRECIO DE VENTA: %f", CANT*6.87);
        TLV += CANT*6.87;
        }  
        default ->   {    
        System.out.print("\nLA OPCION INTRODUCIDA HA SIDO INCORRECTA!!!");
        }        }                                 
        System.out.println("\n***POR FAVOR INGRESE UNA OPCION:");
        System.out.println("*OPRIMA (0) PARA TERMINAR*");
        OP= leer.nextInt(); 
        }       
        System.out.printf("\nEL TOTAL DE VENTAS ES: %f\n\n",TLV);
  }   
   
}
