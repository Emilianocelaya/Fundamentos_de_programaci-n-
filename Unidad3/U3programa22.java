/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa22;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3programa22 {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    int suma=0,num;
    do{
          System.out.println ("solicitar a usuario valor de num  : ");
          num= sc.nextInt();
          suma=suma+num;
         
    } while(num != 0);
    System.out.println ("el resultado es  : "+ suma);
}
    
}
