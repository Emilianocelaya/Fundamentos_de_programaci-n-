/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica01excepcioness;

import java.util.Scanner;

/**
 *
 * @author SALA PAFP 26
 */
public class clasePractica01Excepciones {
   
    public static void primeraExcepcion(){
  String dato = "";
 int convertido = 0;
   Scanner teclado = new Scanner(System.in);
  System.out.println("Introduce un número, lo leeré como cadena y lo convertiré:");
  dato = teclado.nextLine();
  /*Cuando se quiere convertir una cadena que no es un número a entero,se produce un error */
  /*Dentro de la sentencia try se colocan lasinstruciones que podrían generar error */
 try {
convertido = Integer.parseInt(dato);
} catch(Exception e){
/*Con catch se atrapa la excepción y se puede realizar alguna acción*/
System.out.println("El dato leído no es un número!");
}
finally {
System.out.println("Se ejecuta haya excepciones o no, puede servir " + "para cerrar un archivo o una conexión a BD");
}
System.out.println("El dato convertido * 10 = "+convertido*10);
}

public static void combinandoExcepciones(){
String datoLeido = "";
String datoAux = null;
int datoConvertido;
Scanner teclado = new Scanner(System.in);
datoLeido = teclado.nextLine();
if (datoLeido.length()>5) {
datoAux = "hola";
}
try{
int longitud = datoAux.length();
//Puede generar un error Null Pointer
datoConvertido = Integer.parseInt(datoAux);
//Puede generar un error de conversión }
}catch(NullPointerException e){
System.out.println("Trabajando con un valor nulo!");
}
catch (NumberFormatException e){
System.out.println("No se pudo realizar la conversión");
}
}
}





    