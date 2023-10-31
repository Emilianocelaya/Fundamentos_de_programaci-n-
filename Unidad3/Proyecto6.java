/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto6;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Proyecto6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int f,c;
        System.out.print(" ingresar los grados c: ");
        c = sc.nextInt ();
        f = (c * 9/5) + 32;
        System.out.print(" ees igual a los grados fharenhei: " + f);
    }
}
