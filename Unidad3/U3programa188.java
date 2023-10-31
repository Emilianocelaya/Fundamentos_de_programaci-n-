/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa188;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U3programa188 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        double salario=1500, a=1, total=1;
        for (c=1; c<=6; c++)
        {
            System.out.println("Sueldo por año: " + salario);
            a= salario * 0.10;
            salario= salario + a;
        }        
        total = total + salario;
        System.out.println("El sueldo a cabo dentro de 6 años es: " + total);
    }
}

        
    

