/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad5programa5;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class Unidad5programa5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("escribe una palabra: ");
        String palabra = sc.nextLine();
        System.out.println(palabra+" esta palabra esta conformada por: "+palabra(palabra)+" letras");
    }
    public static int palabra(String x){
        int p = x.length();
        return p;
    }
}
    

