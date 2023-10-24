/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa9;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class U3programa9 {

    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
     double hr,suma=0 ;
       System.out.print ("escribe las horas : ");
       hr=sc.nextDouble();
       if(hr>1.01 && hr<=2.00)
           suma=suma+5;
       else if(hr>1.01 && hr<=2.00)
           suma=suma+10;
        System.out.print ("total a apgar $ +suma : ");
    }
}
