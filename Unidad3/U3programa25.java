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
         Scanner sc = new Scanner(System.in);
         char operador;
         double numero1,numero2,resultado;
         
         do{
             System.out.print("ingresar operador (+,-,*,/) o  'q' para salir: ");
             operador = sc.next().charAt(0);
         
             if (operador ==  'q'){
             break;
             
         }
         
            System.out.print("ingresar dos numeros : ");  
           numero1 = sc.nextDouble();
           numero2 = sc.nextDouble();
           switch (operador){
               case '+':
                   resultado = numero1+numero2;
                   break;
                   case '-':
                   resultado = numero1-numero2;
                   break;
                   case '*': si 
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
