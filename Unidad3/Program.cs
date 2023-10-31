using System;

namespace U3programa13 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c, num;
            for (c = 1; c <= 100; c++)
            {
                Console.WriteLine("Ingrese la cantidad de valores totales: ");
                num = Convert.ToInt32(Console.ReadLine());

                if (num > 0)
                {
                    Console.WriteLine("Es positivo");
                }
                else
                {
                    Console.WriteLine("Es negativo");
                }
            }
        }
    }
}
