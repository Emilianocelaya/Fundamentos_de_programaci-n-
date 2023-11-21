/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa9u4;

/**
 *
 * @author Emiliano
 */
public class PROGRAMA9U4 {

    public static void main(String[] args) {
        String[] nombres = { "JUAN", "Emiliano", "EDUARDO"  };
        String[] apellidos = { "HERNANDEZ", "Celaya", "BOTI" };

        String[] nombresCompletos = ConcatenarNombresApellidos(nombres, apellidos);

        System.out.println("Nombres Completos:");
        for (String nombreCompleto : nombresCompletos) {
            System.out.println(nombreCompleto);
        }
    }

    static String[] ConcatenarNombresApellidos(String[] nombres, String[] apellidos) {
        if (nombres.length != apellidos.length) {
            System.out.println("Error: Los arreglos no tienen la misma longitud.");
            return new String[0];
        }

        String[] nombresCompletos = new String[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            nombresCompletos[i] = nombres[i] + " " + apellidos[i];
        }

        return nombresCompletos;
    }
}

    

