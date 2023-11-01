/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa24;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class U3programa24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
             System.out.print("Ingresa un numero entero: ");
              num = sc.nextInt();
            if (num<0){
                break;
                
            }
            if (num % 2 == 0){
                System.out.println(num + "es par ");
               } else {
                System.out.println(num + "es impar ");        
               }
            } while (true);
    }
    
}
