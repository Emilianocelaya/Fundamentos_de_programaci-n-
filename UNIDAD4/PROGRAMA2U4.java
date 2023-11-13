/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.PROGRAMA2U4;

/**
 *
 * @author DELL
 */
public class PROGRAMA2U4 {

    public static void main(String[] args) {
        int[] cal = {9, 8,  7, 7, 8, 8, 9, 8, 6, 7,};
            double promedio = 0, suma = 0;

            for (int i = 0; i < 10; i++)
            {
                suma = suma + cal[i];
                promedio = suma / 10;
            }
            System.out.println("El promedio de tus califiaciones es: " + promedio);
        }
    }