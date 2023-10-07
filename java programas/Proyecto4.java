/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto4;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class Proyecto4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int y, a, x;
        System.out.print("Declarar variable  Y: ");
        y = sc.nextInt ();
        System.out.print("Declarar variable A: ");
        a = sc.nextInt ();
        x = y + a + 3;
        System.out.println("El resultado es " + x);  
        ;
    }
}