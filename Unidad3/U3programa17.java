/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa17;

import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class U3programa17 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  char idk;
  
  do
  {
     System.out.println("Bienvenido a una sala de ejcucion: ");   
     System.out.println("Escribe una n para no condenara a muerte : ");   
    idk=sc.next().charAt(0);
    
  } while(idk !='n');
    }
}
