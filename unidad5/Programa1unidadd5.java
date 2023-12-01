/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa2unidadd5;

/**
 *
 * @author Emiliano
 */
public class Programa2unidadd5 {

    public static void main(String[] args) {
        System.out.println( suma (7, 8) );
         System.out.println( resta (10, 2) );
         System.out.println( multiplicacion (3, 8) );
         System.out.println(division (10, 2) );
    }
    
    
    //1METODO O FUNCION
    public static int suma(int a,int b){
        int r=a +b;
        return r;
        
       
        
    }
        public static int resta(int a,int b){
        int r=a-b;
        return r;

}  
        public static int multiplicacion(int a,int b){
        int r=a*b;
        return r;
}
     public static int division(int a,int b){
        int r=a/b;
        return r;   
}
}



