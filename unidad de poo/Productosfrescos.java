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
public class Productosfrescos extends Productos {
  private Date fehcaEnvasado;
          private String Paisorigen;

    public Productosfrescos(Date fehcaEnvasado, String Paisorigen, Date fechacaducidad, String numeroLote) {
        super(fechacaducidad, numeroLote);
        this.fehcaEnvasado = fehcaEnvasado;
        this.Paisorigen = Paisorigen;
    }

    public Date getFehcaEnvasado() {
        return fehcaEnvasado;
    }

    public void setFehcaEnvasado(Date fehcaEnvasado) {
        this.fehcaEnvasado = fehcaEnvasado;
    }

    public String getPaisorigen() {
        return Paisorigen;
    }

    public void setPaisorigen(String Paisorigen) {
        this.Paisorigen = Paisorigen;
    }
   
    }




    

