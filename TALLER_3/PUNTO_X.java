
package taller_3;

import java.util.Scanner;


public class PUNTO_X {
public void EJECUCION(){
        System.out.println(" PARQUEADERO ");
        Scanner leer = new Scanner(System.in);
        double hr=0;
        double Cargo = 0;
        double Total = 0;
        int Contador = 1;
    
        System.out.println(" PROGRAMA DE COBRO DEL PARQUEADERO ");
        System.out.printf("  INGRESE LA CANTIDAD DE HORAS DEL PARQUEO %d:\n", Contador++);
        System.out.print(" OPRIMA EL NUMERO 0 PARA FINALIZAR\n ");
        hr=leer.nextDouble();
        while (0!=hr){     
        System.out.printf("\n EL SALDO DEL VEHICULO ES: %.2f", Cargo(hr));
        Total+=Cargo(hr);
        System.out.printf("\n INGRESE LA CANTIDAD DE HORAS DEL PARQUEO %d:\n", Contador++);
        System.out.print(" FAVOR OPRIMA EL NUMERO 0 PARA FINALIZAR\n ");
        hr=leer.nextDouble();
        } 
        System.out.printf("\n EL CARGO TOTAL DEL PARQUEO ES: %.2f\n", Total);
        }   



    public double Cargo( double x){    

        if ( 3 >= x )
            return 2.0;

            else
                return (2 + 0.5*Math.ceil(x - 3)) <= 10? 2 + 0.5*Math.ceil(x -3) : 10;
   
}

}
