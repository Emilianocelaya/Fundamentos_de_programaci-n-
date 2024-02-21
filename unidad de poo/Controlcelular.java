/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlcelular;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class Controlcelular {

    public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);

    Celular celular = null;

    // Mostrar menú
    int opcion;
    do {
      System.out.println("=== CONTROL DE CELULAR ===");
      System.out.println("1. Construir un celular");
      System.out.println("2. Habilitar celular");
      System.out.println("3. Mostrar datos del celular");
      System.out.println("4. Salir");
      System.out.print("Selecciona una opción: ");
      opcion = scanner.nextInt();

      // Procesar la opción seleccionada
      switch (opcion) {
        case 1:
          // Crear un objeto Celular
          System.out.print("Introduce la marca del celular: ");
          String marca = scanner.next();
          System.out.print("Introduce el nombre del dueño del celular: ");
          String duenio = scanner.next();
          System.out.print("Introduce el precio del celular: ");
          double precio = scanner.nextDouble();

          celular = new Celular();
          celular.setMarca(marca);
          celular.setDuenio(duenio);
          celular.setPrecio(precio);

          System.out.println("Celular creado correctamente!");
          break;
        case 2:
          // Habilitar el celular
          if (celular != null && celular.estaHabilitado()) {
            System.out.println("El celular ya está habilitado.");
          } else if (celular != null) {
            celular.marcarComoHabilitado();
            System.out.println("Celular habilitado correctamente!");
          } else {
            System.out.println("No se ha creado un celular. Crea uno primero.");
          }
          break;
        case 3:
          // Mostrar datos del celular
          if (celular == null) {
            System.out.println("No se ha creado un celular. Crea uno primero.");
          } else {
            System.out.println(celular.toString());
          }
          break;
        case 4:
          // Salir del programa
          System.out.println("¡Hasta pronto!");
          break;
        default:
          System.out.println("Opción no válida. Inténtalo de nuevo.");
      }
    } while (opcion != 4);
  }
  
}
    

