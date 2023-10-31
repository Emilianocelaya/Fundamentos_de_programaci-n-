using System;

namespace U3programa21 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c = 1, total, numero, alcubo;
            Console.WriteLine("Ingrese la cantidad de numeros: ");
            total = Convert.ToInt32(Console.ReadLine());

            while (c <= total)
            {
                Console.WriteLine("Ingrese su numero: ");
                numero = Convert.ToInt32(Console.ReadLine());
                if (numero > 0)
                {
                    alcubo = numero * numero * numero;
                    Console.WriteLine("El resultado de la operacion es: " + cubo);
                }
                c++;
            }
        }
    }
}
