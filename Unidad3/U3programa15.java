/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa15;
    import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class U3programa15 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i=1, horas,pago,sueldo ;
    while(i<=20)
    {
    System.out.println("ingrese las horas trabajadas en la semana: ");  
    horas = sc.nextInt();
    System.out.println("ingrese el pago por hora  ");  
    pago = sc.nextInt();      
     sueldo = (pago*horas ) ;
        System.out.println("El pago es : " + sueldo);
        i++;
    }
}
    

}
