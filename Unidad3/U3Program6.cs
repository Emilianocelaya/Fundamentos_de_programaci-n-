using System;

namespace U3programa6 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int N;
            Console.WriteLine("Ingrese el un número");
            N = Convert.ToInt32(Console.ReadLine());

            if (N % 2 == 0)
                Console.WriteLine("El número es par");
            else
                Console.WriteLine("El número es impar");

        }
    }
}
