using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] edades = new int[5] { 18, 13, 18, 10, 17 };
            int[] edades2 = new int[5] { 11, 18, 18, 22, 9 };

            /* Console.WriteLine(edades[0]);
            Console.WriteLine(edades[1]);
            Console.WriteLine(edades[2]);
            Console.WriteLine(edades[3]);
            Console.WriteLine(edades[4]); */

            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine("Arreglo1 " + i + " es: " + edades[i]);
                /* Console.WriteLine("Arreglo2 " + i + " es: " + edades2[i]);
                Console.WriteLine(); */
                if (edades[i] >= 18)
                {
                    Console.WriteLine("Eres mayor de edad");
                    Console.WriteLine();
                }
                else
                {
                    Console.WriteLine("Eres menor de edad");
                    Console.WriteLine();
                }


            }
        }
    }
}

