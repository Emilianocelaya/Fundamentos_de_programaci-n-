using System;

namespace U3programa20 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c = 1, año = 1, ahorro = 3;

            while (c <= 365)
            {
                Console.WriteLine("tu  ahorro es de: " + ahorro);
                ahorro = ahorro * 3;
                año = ahorro + año;
                c++;
            }
            Console.WriteLine("Su ahorro al año  es de : " + año);
        }
    }

}
