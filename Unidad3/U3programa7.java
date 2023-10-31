package com.mycompany.u3programa7;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class U3programa7 {
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        double T ;
            System.out.print ("¿Qué temperatura hay hoy?: ");
            T = sc.nextInt();

            if (T >= 27)
            {
                System.out.println("Hace calor: ");
            }
            else if (T < 27 && T >= 20)
            {
                System.out.println("El clima es agradable : ");
            }
            else
            {
                System.out.println("Hace frío: ");

            }
        }
    }


