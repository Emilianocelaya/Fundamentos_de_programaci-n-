/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto10;

import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class Proyecto10 {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int Lado,Perimetro,Apotema,area;
        System.out.print("declarar el valor de L ");
        Lado = sc.nextInt ();
        Perimetro = Lado * 6;
        System.out.print("declarar el valor del apotema ");
        Apotema = sc.nextInt ();
        area = (Perimetro * Apotema) / 2;
        
        System.out.print("El ´área del hexagono es: " + area);
    }
}