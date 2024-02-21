/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlcelular;

/**
 *
 * @author Emiliano
 */
public class Celular {


   


   String marca;
   String duenio;
   double precio;
   boolean estado;

  public Celular() {
    this.estado = false;
  }
  

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getDuenio() {
    return duenio;
  }

  public void setDuenio(String duenio) {
    this.duenio = duenio;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public void marcarComoHabilitado() {
    this.estado = true;
  }

  public boolean estaHabilitado() {
    return estado;
  }

  @Override
  public String toString() {
    return "*Celular:*\n" +
      "Marca: " + marca + "\n" +
      "Dueño: " + duenio + "\n" +
      "Precio: $" + precio + "\n" +
      "Estado: " + (estado ? "Habilitado" : "Deshabilitado");
  }
}


