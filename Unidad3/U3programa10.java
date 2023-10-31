

package com.mycompany.u3programa10;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class U3programa10 {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

            int ht, hx;
            double pago, ssm = 0;
            System.out.println("¿Cuantas horas trabajaste?");
            ht = sc.nextInt();
            System.out.println("¿Cuanto es el pago por hora?");
            pago = sc.nextInt();

            if (ht <= 40 )
            {
                ssm = ht * pago;
                System.out.println("Recibiras un total de $" + ssm);
            }
            else
            {
                hx = ht - 40;
                ssm = 40 * pago + hx * (pago * 2);
                System.out.println("Por trabajar " + hx + " horas extra, usted recibe un total de $" + ssm);


            }
    }
}
