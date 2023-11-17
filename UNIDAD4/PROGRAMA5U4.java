/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa5u4;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class PROGRAMA5U4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int f;

            System.out.println("Ingrese la fruta: ");
            f = sc.nextInt();

            int[] frutas = new int[f];

            for (int i = 0; i < frutas.length; i++)
            {
                System.out.println("fruta al reves " + i + ": ");
                frutas[i] = sc.nextInt();
            }


        }
    }


    

