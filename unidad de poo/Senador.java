/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.legisladores;

/**
 *
 * @author SALA PAFP 26
 */
public class Senador extends Legislador{

    public Senador(String provinciaQueRepreseta, String nombre, int edad, String domicilio) {
        super(provinciaQueRepreseta, nombre, edad, domicilio);
    }
    @Override
    String getCamaraEnQueTrabaja(){
       return"trabaja en la camra de Snadores ";
}

}


    

