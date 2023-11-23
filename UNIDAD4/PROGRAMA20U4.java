/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa20u4;

/**
 *
 * @author LaboratorioLTI2
 */
public class PROGRAMA20U4 {

    public static void main(String[] args) {
     int num [][] = {{5,6},{10,3} };
     int res [][] = new int[2][2];
     for (int f = 0; f < 2; f++){
     for (int c = 0; c < 2; c++){ 
         res [f][c] = num [f][c] * num[f][c];
         
     }
     }
     for (int f = 0; f < 2; f++){
     for (int c = 0; c < 2; c++){ 
         System.out.print(res[f][c] + ",");
     }
     }
     
   
}
    }



