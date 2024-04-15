/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.legisladores;

import java.util.ArrayList;

/**
 *
 * @author SALA PAFP 26
 */
public class ListLegisladores {
    ArrayList<Legislador> listaLegisladores;

    public ListLegisladores(){
        this.listaLegisladores = new ArrayList();
    }
    
    
    void agregarLegislador (Legislador leg){
    listaLegisladores.add(leg);




 for (int i = 0; i < listaLegisladores.size();i++){
       Legislador legis  = listaLegisladores.get(i);
       if (legis instanceof Senador){
           Senador senador = (Senador) legis;
          System.out.println(legis.toString());
       
   }
       else 
       {
          Diputado dip=(Diputado)legis;
          System.out.println(dip.toString());
       }
 }
    }
}
    

     
        
    



