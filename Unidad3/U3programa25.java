/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa25;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class U3programa25 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         char operador;
         double numero1,numero2,resultado;
         
         do{
             System.out.print("ingresar operador (+,-,*,/) o  'q' para salir: ");
             operador = input.next().charAt(0);
         
             if (operador ==  'q'){
             break;
             
         }
         
            System.out.print("ingresar dos numeros : ");  
           numero1 = input.nextDouble();
           numero2 = input.nextDouble();
           switch (operador){
               case '+':
                   resultado = numero1+numero2;
                   break;
                   case '-':
                   resultado = numero1-numero2;
                   break;
                   case '*':
                   resultado = numero1*numero2;
                   break;
                   case '/':
                   resultado = numero1/numero2;
                   break;
                   default:
                    System.out.println("operador invalido : ");       
           }         continue;
           
            
        
           System.out.println(numero1+" "+ operador +" "+ numero2+" = "+ resultado);  
    }  while(true);
    }  
}
