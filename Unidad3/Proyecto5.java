/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto5;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class Proyecto5 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int L1,L2,L3,p,b,h,a;
        System.out.print("Dar valor al lado 1: ");
        L1 = sc.nextInt ();
        System.out.print("Dar valor al lado 2: ");
        L2 = sc.nextInt ();
        System.out.print("Dar valor al lado 3: ");
        L3 = sc.nextInt ();
        p = L1 + L2 + L3;
        System.out.println("El resultado del´perimetro es " + p);
        
        System.out.print("Dar valor al la base: ");
        b = sc.nextInt ();
        System.out.print("Dar valor a la altura: ");
        h = sc.nextInt ();
        a = (b * h) / 2;
        System.out.print("El área es " + a);
    }
}