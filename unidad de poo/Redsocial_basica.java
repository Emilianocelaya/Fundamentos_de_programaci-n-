/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.redsocial_basica;

import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class Redsocial_basica {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Publicacion publicacion = null;

        while (true) {
            System.out.println("=== GESTOR DE PUBLICACIONES ===");
            System.out.println("1. Crear una nueva publicación");
            System.out.println("2. Dar like a la publicación");
            System.out.println("3. Mostrar la publicación");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Introduce el autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Introduce el contenido: ");
                    String contenido = scanner.nextLine();
                    publicacion = new Publicacion(autor, contenido);
                    break;
                case 2:
                    if (publicacion != null) {
                        publicacion.incrementarLike();
                        System.out.println("¡Has dado like a la publicación!");
                    } else {
                        System.out.println("Primero crea una publicación.");
                    }
                    break;
                case 3:
                    if (publicacion != null) {
                        System.out.println("=== Detalles de la Publicación ===");
                        System.out.println("Autor: " + publicacion.getAutor());
                        System.out.println("Contenido: " + publicacion.getContenido());
                        System.out.println("Fecha de publicación: " + publicacion.getFechaPublicacion());
                        System.out.println("Likes: " + publicacion.getLikes());
                    } else {
                        System.out.println("Primero crea una publicación.");
                    }
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
    }
}
    

