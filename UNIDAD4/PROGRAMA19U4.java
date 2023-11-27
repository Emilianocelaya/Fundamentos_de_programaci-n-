/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa19u4;
import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class PROGRAMA19U4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int fila = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columna = sc.nextInt();

        int[][] matrix = new int[fila][columna];

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] resultado = countEvenOdd(matrix);

        System.out.println("La cantidad de números pares es: " + resultado[0]);
        System.out.println("La cantidad de números impares es: " + resultado[1]);
    }

    public static int[] countEvenOdd(int[][] matrix) {
        int fila = matrix.length;
        int columna = matrix[0].length;

        int columnapar = 0;
        int columnaimpar = 0;

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matrix[i][j] % 2 == 0) {
                    columnapar++;
                } else {
                    columnaimpar++;
                }
            }
        }

        return new int[]{columnapar, columnaimpar};
    }
}

    
    

