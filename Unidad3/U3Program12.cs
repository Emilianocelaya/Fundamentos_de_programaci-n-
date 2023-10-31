using System;

namespace U3programa12 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c, total, num;
            Console.WriteLine("escribe el total de los numeros: ");
            total = Convert.ToInt32(Console.ReadLine());
            for (c = 1; c <= total; c++)
            {
                Console.WriteLine("escribe numeros: ");
                num = Convert.ToInt32(Console.ReadLine());
                if (num % 2 == 0)
                    Console.WriteLine("Par");
                else
                    Console.WriteLine("Impar");
            }
        }
    }
}
