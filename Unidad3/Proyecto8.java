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
        double p1, p2, p3, sub, t, iva;
        final double iva=0.16;
        
        System.out.print("¿Qué precio tiene el producto 1? ");
        p1 = sc.nextInt ();
        System.out.print("¿Qué precio tiene el producto 2? ");
        p2 = sc.nextInt ();
        System.out.print("¿Qué precio tiene el producto 3 ? ");
        p3 = sc.nextInt ();
        
        t = p1 + p2 +3;
        ivaT = t * iva;
        subt = t - ivaT;
        System.out.println("El toal es: " + t);
        System.out.println("El subtotal es: " + sub);
        System.out.println("El IVA es: " + iva);  
    }
}
