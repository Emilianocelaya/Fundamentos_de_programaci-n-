/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa21;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U3programa21 {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        int c=1, total, numero, alcubo;
        System.out.println("Ingrese la cantidad de numeros: ");
        total = sc.nextInt();
        
    while(c<=total)
       {
        System.out.println("Ingrese su numero: ");   
        numero = sc.nextInt();
        if(numero>0)
        {
            alcubo = numero * numero * numero;
            System.out.println("El resultado de la operacion es: " + alcubo);
        }
        c++;
       }
    }
}
