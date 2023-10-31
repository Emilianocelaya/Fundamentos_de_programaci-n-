using System;

namespace U3programa16 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int i = 1, h, p, s;
            while (i <= 20)
            {
                Console.WriteLine("Ingrese la cantidad de horas trabajadas en la semana: ");
                h = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Ingrese el pago por horas: ");
                p = Convert.ToInt32(Console.ReadLine());
                s = h * p;
                Console.WriteLine("el pago es es: " + s);
                i++;
            }
        }
    }
}
