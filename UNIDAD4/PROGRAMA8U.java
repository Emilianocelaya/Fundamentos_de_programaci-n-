/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa8u4;

/**
 *
 * @author Emiliano
 */
public class PROGRAMA8U4 {

    public static void main(String[] args) {
    int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Números Pares:");
        for (int num : numeros) {
            if (EsPar(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nNúmeros Impares:");
        for (int num : numeros) {
            if (!EsPar(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static boolean EsPar(int numero) {
        return numero % 2 == 0;
    }
}

