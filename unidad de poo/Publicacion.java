/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.redsocial_basica;
import java.util.Date;
/**
 *
 * @author Emiliano
 */
public class Publicacion {
   
/**
 *
 * @author Codetec
 */

     String autor;
     String contenido;
     Date fechaPublicacion;
     int likes;

   
    public Publicacion(String autor, String contenido) {
        this.autor = autor;
        this.contenido = contenido;
        this.fechaPublicacion = new Date();
        this.likes = 0;
    }

   
    public String getAutor() {
        return autor;
    }

    public String getContenido() {
        return contenido;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getLikes() {
        return likes;
    }

    public void incrementarLike() {
        likes++;
    }
}

