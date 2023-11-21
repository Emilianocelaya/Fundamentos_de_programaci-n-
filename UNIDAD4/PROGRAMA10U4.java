/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa10u4;

/**
 *
 * @author Emiliano
 */
public class PROGRAMA10U4 {

    public static void main(String[] args) {
    String[] paises = { "Namekuzein", "España", "china", "australia", "japon", "inglaterra" };

        double longitudPromedio = CalcularLongitudPromedio(paises);
        System.out.println("Longitud Promedio de las Palabras: " + longitudPromedio);
    }

    static double CalcularLongitudPromedio(String[] arreglo) {
        int totalCaracteres = 0;

        for (String palabra : arreglo) {
            totalCaracteres += palabra.length();
        }

        return (double)totalCaracteres / arreglo.length;
    }
}

    

