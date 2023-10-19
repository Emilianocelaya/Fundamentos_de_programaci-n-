using System;

namespace U3programa1 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {

            {

                int e;

                Console.WriteLine("Ingresa tu edad:");
                e = Convert.ToInt32(Console.ReadLine());

                if (e >= 18)
                {
                    Console.WriteLine("Eres Mayor");
                }
                else
                {
                    Console.WriteLine("Eres Menor");
                }
            }
        }
    }
}
