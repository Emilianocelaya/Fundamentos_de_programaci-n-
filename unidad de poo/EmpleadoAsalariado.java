/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomina;

/**
 *
 * @author SALA PAFP 26
 */
public class EmpleadoAsalariado  extends Empleado{

    public EmpleadoAsalariado(String nombre,  String departamentoalquepertenece) {
        super(nombre,  departamentoalquepertenece);
        this.salariobase=20000.00;
        
        
        
    }

    @Override
   double CalcularSalario(){
       double impuesto =  salariobase*0.32;
       return  salariobase - impuesto;
   }
    
}