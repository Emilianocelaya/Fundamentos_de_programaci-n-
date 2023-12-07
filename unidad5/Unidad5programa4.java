/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad5programa4;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class Unidad5programa4 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("escribe un numero : ");
        int numero = sc.nextInt();
        System.out.println(numero+" "+primo(numero));
    }

    public static String primo(int x){  
        int c=0;
        String p;
        for(int i=x; i>0; i--){
            if(x%i==0){
                c++;
            }
        }
        if(c==2){
            p = "es  primo";
        }else{
            p = "no es  primo";
        }
         return p.toString();
    }
   
}
    

