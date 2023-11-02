/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa24;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U3programa24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do
        {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            if (num < 0){
                break;
            }
            if (num % 2 == 0){
                System.out.println("Es par" + num);
            }else {
                System.out.println("Es impar" + num);
            }
        }while (true);
    }
}
