

using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c, f;

            Console.WriteLine("ingrese la cantidad de filas");
            f = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("ingrese la cantidad de columnas");
            c = Convert.ToInt32(Console.ReadLine());

            string [][] matriz = new string [f,c];
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < c; j++)
                {
                    Console.WriteLine("ingrese el nombre: ");
                    matriz[i][j] = Convert.ToInt32(Console.ReadLine());
                }
            }
            for (int i = f - 1; i >= 0; i--)
            {
                for (int j = c - 1; j >= 0; j--)
                {
                    Console.WriteLine("alrevez: " + matriz[i][j]);

                }
            }
        }
    }


    }


