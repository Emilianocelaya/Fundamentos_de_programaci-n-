/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author SALA PAFP 26
 */
public class FiguraGeometrica {
    int puntox;
    int puntoY;
    int tamanioborde;
    String colorBorde;
    String colorRelleno;
  //insertar constructor get y set 

    public FiguraGeometrica(int puntox, int puntoY, int tamanioborde, String colorBorde, String colorRelleno) {
        this.puntox = puntox;
        this.puntoY = puntoY;
        this.tamanioborde = tamanioborde;
        this.colorBorde = colorBorde;
        this.colorRelleno = colorRelleno;
    }
    
    public int getPuntox() {
        return puntox;
    }

    public int getPuntoY() {
        return puntoY;
    }

    public int getTamanioborde() {
        return tamanioborde;
    }

    public String getColorBorde() {
        return colorBorde;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setPuntox(int puntox) {
        this.puntox = puntox;
    }

    public void setPuntoY(int puntoY) {
        this.puntoY = puntoY;
    }

    public void setTamanioborde(int tamanioborde) {
        this.tamanioborde = tamanioborde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "puntox=" + puntox + ", puntoY=" + puntoY + ", tamanioborde=" + tamanioborde + ", colorBorde=" + colorBorde + ", colorRelleno=" + colorRelleno + '}';
    }
    
    
    
            
         
}
