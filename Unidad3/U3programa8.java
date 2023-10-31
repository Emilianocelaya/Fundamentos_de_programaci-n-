

package com.mycompany.u3programa8;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class U3programa8 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int N1, N2;
            System.out.println("declare el primer número: ");
            N1 = sc.nextInt();
            System.out.println("declare el segundo número: ");
            N2 = sc.nextInt();

            if (N1 > N2)
                System.out.println(N1 + " es mayor que " + N2);
            else
                System.out.println(N1 + " es menor que " + N2);

        }
    }

