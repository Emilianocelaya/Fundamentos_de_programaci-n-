/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomina;


/**
 *
 * @author SALA PAFP 26
 */
public abstract class Empleado  {
    String nombre;
    double salariobase;
    String departamentoalquepertenece;

    public Empleado(String nombre, String departamentoalquepertenece) {
        this.nombre = nombre;
      this.departamentoalquepertenece = departamentoalquepertenece;
       
    

  
    }
    abstract double CalcularSalario();

}
