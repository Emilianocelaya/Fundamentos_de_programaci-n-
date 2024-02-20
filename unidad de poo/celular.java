/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_celular;

/**
 *
 * @author SALA PAFP 26
 */
public class celular {
    
 String marca ;
    String dueño ;
    double precio ;
    boolean estado ;

    public celular(boolean estado) {
        this.estado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "celular{" + "marca=" + marca + ", due\u00f1o=" + dueño + ", precio=" + precio + ", estado=" + estado + '}';
    
     void funcion (double funcion){
        precio += funcion ;
        //la instruccion equivale a 
        //saldo = salo + cantidad 
        
    
    } 
    //metodo retirar resive una cantidad que sera restada al saldo 
    void salida(double funcion ){
        if (habilitado(funcion))
        precio= funcion;
        else
            System.out.println("telefono deshabilitado");
    }
    //el metodo hay saldo retorna verdadero si el saldo es mayor o igual a una cantidad o retorna s falso en caso contrario 
    boolean habilitado(double ){
        if (habilitado >= funcion)
            return true;
        else
            return false;
    
    
    }
    
    
    }
   
}    
    



