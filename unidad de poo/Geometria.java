/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometria;
import java.util.Scanner;
// Este proyecto permitira calcular el area, el perimetro.
// Dibujar figuras(simulado);
// Se crearán Circulos, Cuadrados y Triangulos.
public class Geometria {
 static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        // TODO code application logic here
        Circulo cir;
        Cuadrado  cua;
        Triangulo tri;
        int opcion;
       
        do{
       
        System.out.println("Que figura desea crear?");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.println("4. Salir");
        opcion=sc.nextInt();
        sc.nextLine();
       
          switch(opcion){
              case 1: cir = crearCirculo();
              System.out.println("area del circulo" + cir.calcularArea());
              System.out.println("perimetro del circulo" + cir.calcularperimetro());
              System.out.println("datos del circulo" + cir.toString());
              break;
              case 2: cua = crearCuadrado();
              System.out.println("area del cuadrado" + cua.calcularArea());
              System.out.println("perimetro del cuadrado" + cua.calcularperimetro());
              System.out.println("area del circulo" + cua.toString());
              break;
              case 3: tri = crearTriangulo();
              System.out.println("area del triangulo" + tri.CalcularArea());
              System.out.println("perimetro del triangulo" + tri.CalcularPerimetro());
              System.out.println("area del triangulo" + tri.toString());
              break;
              case 4: System.out.println("adios");
              break;
              default : System.out.println("Error en la matrix, intenta de nuevo");
             
             
          }
       
        }while(opcion!=4);
    }
        public static Circulo crearCirculo(){
            Circulo c;
            float radio;
            int puntoX, puntoY, tamanioBorde;
            String colorBorde, colorRelleno;
            System.out.println("Radio del circulo");
            radio=sc.nextFloat();
            sc.nextLine();
            System.out.println("Punto X del circulo");
            puntoX=sc.nextInt();
            System.out.println("Punto Y del circulo");
            puntoY=sc.nextInt();
            System.out.println("Tamaño del borde");
            tamanioBorde=sc.nextInt();
            System.out.println("Color del borde");
            colorBorde=sc.nextLine();
            System.out.println("Color del relleno");
            colorRelleno=sc.nextLine();
            c = new Circulo(radio, puntoX,puntoY,tamanioBorde,colorBorde,colorRelleno);
           
        return c;
       
       
        }
          public static Cuadrado crearCuadrado(){
            Cuadrado cu;
            float lado;
            int puntoX, puntoY, tamanioBorde;
            String colorBorde, colorRelleno;
            System.out.println("Lado del cuadrado");
            lado=sc.nextFloat();
            sc.nextLine();
            System.out.println("Punto X del cuadrado");
            puntoX=sc.nextInt();
            System.out.println("Punto Y del cuadrado");
            puntoY=sc.nextInt();
            System.out.println("Tamaño del borde");
            tamanioBorde=sc.nextInt();
            System.out.println("Color del borde");
            colorBorde=sc.nextLine();
            System.out.println("Color del relleno");
            colorRelleno=sc.nextLine();
            cu = new Cuadrado(lado, puntoX,puntoY,tamanioBorde,colorBorde,colorRelleno);
           
        return cu;
       
       
        }
          public static Triangulo crearTriangulo(){
            Triangulo t;
            float base, altura;
            int puntoX, puntoY, tamanioBorde;
            String colorBorde, colorRelleno;
            System.out.println("Base del triangulo");
            base=sc.nextFloat();
            System.out.println("Altura del triangulo");
            altura=sc.nextFloat();
            sc.nextLine();
            System.out.println("Punto X del triangulo");
            puntoX=sc.nextInt();
            System.out.println("Punto Y del triangulo");
            puntoY=sc.nextInt();
            System.out.println("Tamaño del borde");
            tamanioBorde=sc.nextInt();
            System.out.println("Color del borde");
            colorBorde=sc.nextLine();
            System.out.println("Color del relleno");
            colorRelleno=sc.nextLine();
            t = new Triangulo(base, altura, puntoX,puntoY,tamanioBorde,colorBorde,colorRelleno);
           
        return t;
       
       
        }
   
}