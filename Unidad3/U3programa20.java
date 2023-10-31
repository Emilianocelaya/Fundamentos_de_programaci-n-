/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa20;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U3programa20 {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        int c=1,año=1, ahorro=3;
        
    while(c<=365)
       {
        System.out.println("tu ahorro es de: " + ahorro);   
        ahorro = ahorro * 3;
        año = ahorro + año;
        c++;
       }
        System.out.println("Su ahorro al año es de : "+ año);   
	}
}
 