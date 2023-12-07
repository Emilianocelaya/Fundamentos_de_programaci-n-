/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad5programa7;
import java.util.Scanner; 
/**
 *
 * @author Emiliano
 */
public class Unidad5programa7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("escriba el precio del producto : ");
        double producto = sc.nextDouble();
        System.out.print("Cuantos productos son : ");
        int n= sc.nextInt();
        System.out.println("Subtotal del producto: "+subtotal(producto, n)+" $");
        System.out.println("IVA del producto: "+iva(producto)+" $");
        System.out.println("Total a pagar: "+total(producto,n)+" $");
    }
   
    public static double iva(double pr){
        double IVA=0.16;
        double r = pr*IVA;
        return r;
    }
  
    public static double subtotal(double pr, int sub){
        double r = pr*sub;
        return r;
    }
   
    public static double total(double pr, double iv){
        double IVA=0.16;
        double r= (pr*iv)+((pr*iv)*IVA);
        return r;
    }
    
}
    

