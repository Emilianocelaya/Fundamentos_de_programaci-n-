/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa2;
import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class Programa2 {
     
    public static void main(String[] args) { //Paso 1
        Scanner sc= new Scanner (System.in);
        int a, b, suma; // Paso 2
        System.out.print("Escribe un numero A: ");
        a=sc.nextInt();
        System.out.print("Escribe un numero B: ");
        b=sc.nextInt();
        suma=a+b;
        System.out.println("Resultado: "+ suma);
    }
}
