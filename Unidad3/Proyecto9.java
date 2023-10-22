/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto9;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class Proyecto9 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N1,N2,suma,resta,multiplicacion,division;
        System.out.print("Escribe un número:");
        N1 = sc.nextInt ();
        System.out.print("Escribe un número:");
        N2 = sc.nextInt ();
        
        suma = N1 + N2;
        System.out.println("El resultado de la suma es: " + suma);
        
        resta = N1 - N2;
        System.out.println("El resultado de la resta es: " + resta);
        
        multiplicacion = N1 * N2;
        System.out.println("El resultado de la multiplicación es: " + multiplicacion );
        
        division = N1 / N2;
        System.out.println("El resultado de la división es: " + division);
    }
}