/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa16u4;

/**
 *
 * @author LaboratorioLTI2
 */
public class PROGRAMA16U4 {

    public static void main(String[] args) {
        int diagonal [][] = {{1,5,6},{3,10,3},{17,8,9 }};
        System.out.println("diagonal principal: ");
         for (int c = 0; c< diagonal.length; c++){
            System.out.print(diagonal[c][c]+" ");
         }
          System.out.println("diagonal inversa: ");
         for (int i = 0; i<3; c++){
            System.out.print(diagonal[i][diagonal.length -1 -i]+" ");
         }
    }
    }

