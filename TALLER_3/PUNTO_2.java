
package taller_3;

import java.util.Scanner;


public class PUNTO_2 {
public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        int SaldoInicio, AbonosMes, CargosCliente, LimiteCredito;
        System.out.println(" INGRESE EL SALDO INICIAL: ");
        SaldoInicio = entrada.nextInt();
        
        System.out.println(" INGRESE EL TOTAL DE ABONOS EN EL MES: ");
        AbonosMes = entrada.nextInt();
        
        System.out.println(" INGRESE CARGOS DEL CLIENTE: ");
        CargosCliente = entrada.nextInt();
        
        System.out.println(" INGRESE EL LIMITE DEL CREDITO: ");
        LimiteCredito = entrada.nextInt();
        
        int Credito = SaldoInicio + AbonosMes - CargosCliente;
        int Total =  LimiteCredito - Credito;
        if( Credito < LimiteCredito ) {
            System.out.println( " EL SALDO QUE QUEDO A FAVOR FUE DE: " + Total);
            System.out.println(" EL CREDITO NO SE HA EXCEDIDO ");
        } else {
            System.out.println(" EL LIMITE DEL CREDITO SE HA EXCEDIDO ");
        }
    

    
    }
}
   

