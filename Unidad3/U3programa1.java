/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa1;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3programa1 {

    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       int edad;
       System.out.print("escribe tu edad : " );
       edad=sc.nextInt ();
       if(edad>=18)
           System.out.println("eres mayor de edad!! ");
       else 
           System.out.println(" eres menor de edad : ");
    }
}
