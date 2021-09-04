
package taller_3;


public class PUNTO_XI {
public int Calcular( int x ){
 int DIVISOR = 1,CONTADOR = 0,DIGITO = 1;
 while ( 0 != DIGITO )
 {      
 DIGITO = x / DIVISOR;
 DIVISOR *= 10;
 CONTADOR++;
 }      
 return --CONTADOR;
 }      

 public void Invierte (int y ) {         
 int dgt=Calcular(y);
 for (int i = 1; i < dgt; i++){       
 System.out.printf("\t%d", y % 10);     
 y /= 10;        
 }       
 System.out.printf("\t%3d", y);
 System.out.println("\n");
 }    
}
