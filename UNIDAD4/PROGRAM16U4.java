/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program16u4;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class PROGRAM16U4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c, f;
        
        System.out.println("ingrese la cantidad de filas");
        f = sc.nextInt();
        System.out.println("ingrese la cantidad de columnas");
        c = sc.nextInt ();
        
      String[][] matriz = new String [f][c];
      for(int i=0; i<2; i++){
      for (int j = 0; j < c;  j++){
      System.out.println("ingrese el nombre: ");
      matriz[i][j] = sc.next();
      }
    }
    for(int i= f - 1;i>=0; i-- ){
    for (int j = c - 1; j>=0; j--){
       System.out.println("alrevez: "+ matriz[i][j]);
       
    }
}
}
}
