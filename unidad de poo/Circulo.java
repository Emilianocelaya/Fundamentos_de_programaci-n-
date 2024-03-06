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
public class Circulo extends FiguraGeometrica {
    float radio;

    public Circulo(float radio,  int puntox, int puntoY, int tamanioborde, String colorBorde, String colorRelleno) {
        super(puntox, puntoY, tamanioborde, colorBorde, colorRelleno);
        this.radio = radio;
       
    }
     public void dibujar(){
    System.out.println("dibujando circulo");
        
    }
     //con este metodo vamos a calcular el area del circulo 
     double calculaArea(){
         double area;
         area = 3.1416 * (radio*radio);
         return area;
     }
     
     double calcularperimetro (){
         double perimetro;
         double diametro;
         diametro=radio*2;
         perimetro = 3.1416 * diametro;
         return perimetro;
             
     }

    @Override
    public String toString() {
        return super.toString()+ "Circulo{" + "radio=" + radio + '}';
    }

    String calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
     
     
}



      
    
    
