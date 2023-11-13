/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.PROGRAMA4U4;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class PROGRAMA4U4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = 0, num;
            System.out.println("Ingrese los números a procesar: ");
            num = sc.nextInt();

            int[] neg = new int[num];

            for (int i = 0; i < neg.length; i++)
            {
                System.out.println("Escribe un número en decimal negativo " + i + ": "); ;
                neg[i] = sc.nextInt();

                if (neg[i] < 0)
                {
                    i++;
                }
                System.out.println("Hay un total de " + i + " números negativos.");
            }

        }
    }
