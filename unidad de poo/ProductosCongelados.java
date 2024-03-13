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
public class ProductosCongelados  extends Productos{
    private int teperaturaCongelacion;

    public ProductosCongelados(int teperaturaCongelacion, Date fechacaducidad, String numeroLote) {
        super(fechacaducidad, numeroLote);
        this.teperaturaCongelacion = teperaturaCongelacion;
    }

    public int getTeperaturaCongelacion() {
        return teperaturaCongelacion;
    }

    public void setTeperaturaCongelacion(int teperaturaCongelacion) {
        this.teperaturaCongelacion = teperaturaCongelacion;
    }
    
    
    
}
