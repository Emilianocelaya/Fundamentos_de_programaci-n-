using System;

namespace U3programa19 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c, cn, n = 0, igual = 0, mayor = 0, menor = 0;
            Console.WriteLine("Ingrese la cantidad de numeros: ");
            cn = Convert.ToInt32(Console.ReadLine());

            for (c = 1; c <= cn; c++)
            {
                Console.WriteLine("Ingrese su numero: ");
                n = Convert.ToInt32(Console.ReadLine());
                if (n == 0)
                {
                    igual++;
                }
                else if (n > 0)
                {
                    mayor++;
                }
                else if (n < 0)
                {
                    menor++;
                }
            }
            Console.WriteLine("Numeros iguales a cero: " + igual);
            Console.WriteLine("Numeros mayores a cero: " + mayor);
            Console.WriteLine("Numeros menores a cero: " + menor);
        }
    }
}
