/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto8;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class Proyecto8 {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        double p1, p2, p3, subt, t, ivaT;
        final double iva=0.16;
        
        System.out.print("¿Qué precio tiene el 1er producto? ");
        p1 = sc.nextInt ();
        System.out.print("¿Qué precio tiene el 2do producto? ");
        p2 = sc.nextInt ();
        System.out.print("¿Qué precio tiene el 3er producto? ");
        p3 = sc.nextInt ();
        
        t = p1 + p2 +3;
        ivaT = t * iva;
        subt = t - ivaT;
        System.out.println("El toal es: " + t);
        System.out.println("El subtotal es: " + subt);
        System.out.println("El IVA es: " + ivaT);  
    }
}