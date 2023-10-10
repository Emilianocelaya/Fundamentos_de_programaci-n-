/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa11;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Programa11 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int edad;
        System.out.print("Escriba su edad: ");
        edad = sc.nextInt ();
        if (edad >= 18){ 
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
