/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa17u4;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class PROGRAMA17U4 {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int fila = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[fila][columns];
        int[][] matrix2 = new int[fila][columns];

        System.out.println("Ingrese los elementos de la primera matriz:");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la segunda matriz:");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] result = multiplyMatrices(matrix1, matrix2);

        System.out.println("El resultado de la multiplicación de matrices es:");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int fila1 = matrix1.length;
        int columna1 = matrix1[0].length;
        int fila2 = matrix2.length;
        int columna2 = matrix2[0].length;

        if (columna1 != fila2) {
            throw new IllegalArgumentException("El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz");
        }

        int[][] result = new int[fila1][columna2];

        for (int i = 0; i < fila1; i++) {
            for (int j = 0; j < columna2; j++) {
                for (int k = 0; k < columna1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
}

    

