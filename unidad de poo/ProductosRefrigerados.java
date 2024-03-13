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
public class ProductosRefrigerados  extends Productos{
    private String codigoSupervicion;

    public ProductosRefrigerados(String codigoSupervicion, Date fechacaducidad, String numeroLote) {
        super(fechacaducidad, numeroLote);
        this.codigoSupervicion = codigoSupervicion;
    }

    public String getCodigoSupervicion() {
        return codigoSupervicion;
    }

    public void setCodigoSupervicion(String codigoSupervicion) {
        this.codigoSupervicion = codigoSupervicion;
    }

 

   

    
        
    }
    
    

