/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.legisladores;

import java.util.Scanner;

/**
 *
 * @author SALA PAFP 26
 */
public class Legisladores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaLegisladores listaLeg = new ListaLegisladores
        int opcion; 
        do{
        System.out.println("camara de diputados y senadores ");
        System.out.println("seleccione una opcion  ");
        System.out.println(" 1 crea legisladores ");
        System.out.println("2 Mostrar legisladores");
        System.out.println("3 salir ");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1 crearLegisladores(listaLeg);
            break;
            case 2; listaLeg.mostrar legisladores();
            break;
            default System.out.println("opcion no valida");
            
        }
        while(opcion!=3);
    }
    static void crearLegislador(ListaLegisladores lostaLeg);
}
