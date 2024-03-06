/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

import geometria.FiguraGeometrica;

/**
 *
 * @author SALA PAFP 26
 */
public class Cuadrado extends FiguraGeometrica {
    
   float lado;

    public Cuadrado(float lado, int puntox, int puntoY, int tamanioborde, String colorBorde, String colorRelleno) {
        super(puntox, puntoY, tamanioborde, colorBorde, colorRelleno);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
   
    void dibujarCuadrado(){
        System.out.println("dibujaando el cuadrado");
        
    }
    double calcularArea(){
        double area;
        area = lado * lado;
        return area;
        
    }
    double calcularPerimetro(){
        return lado *4;
    }

    String calcularperimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
