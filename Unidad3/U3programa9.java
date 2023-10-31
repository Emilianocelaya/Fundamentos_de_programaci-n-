/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa9;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class U3programa9 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int h1, h2, h3;
            double costo = 0;
            System.out.println("Utiliza el formato de 24 horas.");
            System.out.println("¿Cual fue la hora de entrada? ");
            h1= sc.nextInt();
            System.out.println("¿Cual fue la hora de salida? ");
            h2 = sc.nextInt();

            h3 = h2 - h1;
            System.out.println("Usted estuvo " + h3 + " horas en total");

            if (h3 <= 2)
            {
                costo = h3 * 5;
                System.out.println("Por las " + h3 + " horas que estuvo aqui, tiene que pagar $" + costo);
            }

            else if (h3 <= 5)
            {
                costo = 2 * 5 + (h3 - 2) * 4;
                System.out.println("Por las " + h3 + " horas que estuvo aqui, tiene que pagar $" + costo);
            }

            else if (h3 <= 10)
            {
                costo = 2 * 5 + 3 * 4 + (h3 - 5) * 3;
                System.out.println("Por las " + h3 + " horas que estuvo aqui, tiene que pagar $" + costo);
            }

            else
            {
                costo = 2 * 5 + 3 * 4 + 5 * 3 + (h3 - 10) * 2;
                System.out.println("Por las " + h3 + " horas que estuvo aqui, tiene que pagar $" + costo);
            }
    }
}
