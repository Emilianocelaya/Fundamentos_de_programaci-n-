/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.legisladores;

/**
 *
 * @author SALA PAFP 26
 */
public abstract class Legislador extends Persona {
   String provinciaQueRepreseta;

    public Legislador(String provinciaQueRepreseta, String nombre, int edad, String domicilio) {
        super(nombre, edad, domicilio);
        this.provinciaQueRepreseta = provinciaQueRepreseta;
    }

    @Override
    public String toString() {
        return super.toString()+ "Legislador{" + "provinciaQueRepreseta=" + provinciaQueRepreseta + '}';
    }
   
   abstract  String getCamaraEnQueTrabaja();
}
