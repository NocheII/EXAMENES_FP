/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_25550865;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Examen2_25550865 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, opcion;
        int numImp = 0;
        
       
        System.out.println("Ingrese el valor: ");
        valor = input.nextInt();
        
        System.out.println("Quiere imprimir los numeros primos o no primos: (1/0)");
        opcion = input.nextInt();
        
        if(opcion == 1){
            for (int i = 2; i < valor; i++){
                int residuo = valor % i;
                if (residuo != 0){
                    numImp = i;
                    for(int j = 1; j <= i; j++){
                        System.out.print("#");
                    }
                    System.out.println("");
                }
            }
            
        }else if(opcion == 0){
            for (int i = 2; i < valor; i++){
                int residuo = valor % i;
                if (residuo == 0){
                    numImp = i;
                    for(int j = 1; j <= i; j++){
                        System.out.print("#");
                    }
                    System.out.println("");
                }
            }
        }
        // TODO code application logic here
    }
    
}
