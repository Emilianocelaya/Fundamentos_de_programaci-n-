/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad5programa2;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class Unidad5programa2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        double c;
        System.out.println("1. Temperatura C° a F°.");
        System.out.println("2. Temperatura F° a K°.");
        System.out.println("3. Medidas pulgadas a centimetros.");
        System.out.println("4. Horas a segundos.");
        do{
            System.out.print("Elija el numero conervsion a realizar: ");
            p=sc.nextInt();

            switch (p) {
                case 1:
                    System.out.print("Ingrese los gardos centigrados: ");
                    c = sc.nextInt();
                    System.out.println(c+" C equivale a: "+f(c)+" F");
                    break;
                case 2:
                    System.out.println(k());
                    break;
                case 3:
                    cm();
                    break;
                case 4:
                    h();
                    break;
            
                default:
                System.out.println("No entra en una de las opciones. ");
                    break;
            }
        }while(p<1 || p>4);
    }
        // 1. C a F
      public static double f(double c){
            double r = (c * 1.8) + 32;
            return r;
        }
        //2. F a K
        public static double k(){
            Scanner sc = new Scanner(System.in);
            double f, r;
            System.out.print("Ingrese la temperatura en farenheit: ");
            f = sc.nextDouble();
            r = (f - 32)-(5/9) + 273.15;
            return r;
        }
        //3. pulgadas a centimetros
        public static void cm()
        {
            Scanner sc = new Scanner(System.in);
            double p, r;
            System.out.print("Ingrese la medidad en pulgadas: ");
            p = sc.nextDouble();
            r = p * 39.37;
            System.out.println(p+" in equivalen a: "+r+" cm");
        }
        //4. hrs a seg
        public static void h() 
        {
            Scanner sc = new Scanner(System.in);
            double h, seg;
            System.out.println("Ingrese las horas a convertir: ");
            h = sc.nextDouble();
            seg = h * 3600;
            System.out.println(h+" hrs equivalen a: "+seg+" seg");
            
        }
    
}
  

