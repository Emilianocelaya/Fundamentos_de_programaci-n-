/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa13;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class U3programa13 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int c,num;
    
    for (c=1;c<=2;c++)
    {
        System.out.println("ingresa la cantidad de valores totales: ");
        num = sc.nextInt();
        
       if(num>0)
      {
          System.out.println("es positivo: ");
          
      }else
        {   
         System.out.println("es negativo: ");    
        }
    }

    }
}
