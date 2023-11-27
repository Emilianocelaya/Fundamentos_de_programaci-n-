using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese el número de filas: ");
            int fila = int.Parse(Console.ReadLine());

            Console.Write("Ingrese el número de columnas: ");
            int columna = int.Parse(Console.ReadLine());

            int[][] matrix = new int[fila][];

            for (int i = 0; i < fila; i++)
            {
                matrix[i] = new int[columna];
            }

            Console.WriteLine("Ingrese los elementos de la matriz:");

            for (int i = 0; i < fila; i++)
            {
                for (int j = 0; j < columna; j++)
                {
                    matrix[i][j] = int.Parse(Console.ReadLine());
                }
            }

            int[] result = CountEvenOdd(matrix);

            Console.WriteLine("La cantidad de números pares es: " + result[0]);
            Console.WriteLine("La cantidad de números impares es: " + result[1]);
        }

        public static int[] CountEvenOdd(int[][] matrix)
        {
            int fila = matrix.Length;
            int columna = matrix[0].Length;

            int cpar = 0;
            int cimpar = 0;

            for (int i = 0; i < fila; i++)
            {
                for (int j = 0; j < columna; j++)
                {
                    if (matrix[i][j] % 2 == 0)
                    {
                        cpar++;
                    }
                    else
                    {
                        cimpar++;
                    }
                }
            }

            return new int[] { cpar, cimpar };
        }
    }


}
    




