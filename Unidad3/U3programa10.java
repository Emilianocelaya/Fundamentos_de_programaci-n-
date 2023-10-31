

package com.mycompany.u3programa10;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class U3programa10 {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

            int h, horasextra;
            double pago, sueldosemanal = 0;
            System.out.println("¿Cuantas horas trabajaste?");
            ht = sc.nextInt();
            System.out.println("¿Cuanto es el pago por hora?");
            pago = sc.nextInt();

            if (h <= 40 )
            {
                sueldosemanalm = ht * pago;
                System.out.println("Recibiras un total de $" + ssm);
            }
            else
            {
                h = horasextra - 40;
                ssm = 40 * pago + horasextra * (pago * 2);
                System.out.println("Por trabajar " + horasextra + " horas extra, su paga es de " + sueldosemanal);


            }
    }
}
