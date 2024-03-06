/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author SALA PAFP 27
 */
public class Triangulo extends FiguraGeometrica {
    float base, altura;

    public Triangulo(float base, float altura, int puntoX, int puntoY, int tamanioBorde, String colorBorde, String colorRelleno) {
        super(puntoX, puntoY, tamanioBorde, colorBorde, colorRelleno);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    void dibujarTriangulo(){
        System.out.println("Dibujando el triangulo");
    }
   
    double CalcularArea(){
        double area;
        area = base * altura / 2;
        return area;
    }
    double CalcularPerimetro(){
        return base * 3;
    }
}

