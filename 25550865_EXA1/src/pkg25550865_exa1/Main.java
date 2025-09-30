/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg25550865_exa1;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class Main {
    final static String PIN = "1234";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double SaldoInicial = 5000;
        double Retiro, Monto, SaldoFinal;
        int opcion;
        String pin;
        
        System.out.println("Introduzca el pin: ");
        pin = input.nextLine();
        
        if (pin.equals(PIN)){
            System.out.println("Bienvenido");
            System.out.println("1. Consultar saldo ");
            System.out.println("2. Retirar dinero ");
            System.out.println("3. Depositar dinero ");
            opcion = input.nextInt();
            if(opcion == 1){
                System.out.println("Su saldo es de: " + SaldoInicial + "Pesos");
            }else if(opcion == 2){
                System.out.println("Cuanto dinero desea retirar?: ");
                Retiro = input.nextDouble();
                if(Retiro <= SaldoInicial){
                    SaldoFinal = SaldoInicial - Retiro;
                    System.out.println("Retiro exitoso, su nuevo saldo es de: "+ SaldoFinal + "Pesos");
                }else{
                    System.out.println("Retiro fallido, fondos insuficientes");
                }
            }else if(opcion ==3 ){
                System.out.println("Cuanto dinero desea depositar: ");
                Monto = input.nextDouble();
                if(Monto >= 0){
                    SaldoFinal = SaldoInicial + Monto;
                    System.out.println("Deposito exitoso, su nuevo saldo es de: "+ SaldoFinal + "Pesos");
                }else{
                    System.out.println("Deposito fallido, no es posible hacer ese movimiento");
                }
            }else{
            }
            
        }else{
            System.out.println("Acceso denegado");
        }
        // TODO code application logic here
    }
    
}
