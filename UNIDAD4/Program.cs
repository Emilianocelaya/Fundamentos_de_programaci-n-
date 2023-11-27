using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese el número de filas: ");
            int fila = Convert.ToInt32(Console.ReadLine()); ;

            Console.WriteLine("Ingrese el número de columnas: ");
            int column = Convert.ToInt32(Console.ReadLine()); ;

            int[][] matrix1 = new int[fila][column];
            int[][] matrix2 = new int[fila][column];

            Console.WriteLine("Ingrese los elementos de la primera matriz:");

            for (int i = 0; i < fila; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    matrix1[i][j] = Convert.ToInt32(Console.ReadLine()); ;
                }
            }

            Console.WriteLine("Ingrese los elementos de la segunda matriz:");

            for (int i = 0; i < fila; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    matrix2[i][j] = Convert.ToInt32(Console.ReadLine()); ;
                }
            }

            int[][] result = multiplyMatrices(matrix1, matrix2);

            Console.WriteLine("El resultado de la multiplicación de matrices es:");

            for (int i = 0; i < fila; i++)
            {
                for (int j = 0; j < column; j++)
                {
                    Console.WriteLine(result[i][j] + " ");
                }

                Console.WriteLine();
            }
        }

        public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2)
        {
            int fila1 = matrix1 = String.Length;
            int columna1 = matrix1[0] = String.Length;
            int fila2 = matrix2= String.Length;
            int columna2 = matrix2[0] = String.Length;

            if (columna1 != fila2)
            {
                throw new IllegalArgumentExceptio("El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz");
            }

            int[][] result = new int[fila1][columna2];

            for (int i = 0; i < fila1; i++)
            {
                for (int j = 0; j < columna2; j++)
                {
                    for (int k = 0; k < columna1; k++)
                    {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            return result;
        }
    }

}
    
