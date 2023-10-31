/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa19;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U3programa19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, cn, n=0, igual=0, mayor=0, menor=0;
        System.out.println("Ingrese los numeros: ");
        cn = sc.nextInt();
        
        for(c=1; c<=cn; c++)
        {
            System.out.println("Ingrese su numero: ");
            n = sc.nextInt();
            if (n==0)
            {
                igual++;
            }else if (n>0)
            {
                mayor++;
            }else if (n<0)
            {
                menor++;
            }
        }
            System.out.println("Numeros iguales a cero: " + igual);
            System.out.println("Numeros mayores a cero: " + mayor);
            System.out.println("Numeros menores a cero: " + menor);
    }
}
