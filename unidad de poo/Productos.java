/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioherencia1;
import java.util.Date;
/**
 *
 * @author SALA PAFP 26
 */
public class Productos {
   private Date fechacaducidad ;
   private String numeroLote  ;  

    public Productos(Date fechacaducidad, String numeroLote) {
        this.fechacaducidad = fechacaducidad;
        this.numeroLote = numeroLote;
    }

    public Date getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(Date fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }
   
}

   

