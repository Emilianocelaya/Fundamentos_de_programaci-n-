/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto7;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class Proyecto7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m;
        double p;
        System.out.print("declarar el valor de la variable m: ");
        m = sc.nextInt ();
        p = m * 3.28;
        System.out.print("el resultado en pies es : " + p);

    }
}