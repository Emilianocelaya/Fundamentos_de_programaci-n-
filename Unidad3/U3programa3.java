/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3programa3;
import java.util.Scanner; 
/**
 *
 * @author LaboratorioLTI2
 */
public class U3programa3 {

    public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      int dia;
      System.out.print ("Programa para los dias de la semana");
      System.out.print ("introdusca un numero para saber que dia es: ");
      dia=sc.nextInt();
      switch(dia) {
      case 1:
      System.out.println("Es lunes");
      break ;
      case 2:
      System.out.println("Es Martes");
      break;
      case 3:
      System.out.println("Es Miercoles");
      break;
      case 4:
      System.out.println("Es Jueves");
      break;
      case 5:
      System.out.println("Es Viernes ");
      break;
      case 6:
      System.out.println("Es Sabado ");
      break;
      case 7:
      System.out.println("Es Domingo ");
      break;
    }  
      
    }
}
