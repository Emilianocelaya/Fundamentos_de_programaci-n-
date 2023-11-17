/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa7u4;

/**
 *
 * @author Emiliano
 */
public class PROGRAMA7U4 {

    public static void main(String[] args) {
        double[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

            double media = CalcularMedia(numeros);
            System.out.println("La media es: " + media);

            double mediana = CalcularMediana(numeros);
            System.out.println("La mediana es: " + mediana);
        }

        static double CalcularMedia(double[] arreglo)
        {
            double suma = 0, i;
            int numeros=0;
            for (i = 0; i < arreglo.length; i++)
            {
                 suma +=numeros;      
            }

            return suma / arreglo.length;
        }


        static double CalcularMediana(double[] arreglo)
        {
            int n;
            for (n = 0; n < arreglo.length; n++){

            if (n % 2 == 0)
            {
                int indice1 = n / 2 - 1;
                int indice2 = n / 2;
                return (arreglo[indice1] + arreglo[indice2]) / 2.0;
            }
            else
            {
                int indice = n / 2;
                return arreglo[indice];
                }    
           
            }
            return(0);
        }
}

    

