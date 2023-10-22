using System;

namespace U3programa8// Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double p1, p2, p3, subt, t, ivaT;
             double iva = 0.16;

            Console.WriteLine("¿Qué precio tiene el 1er producto? ");
            p1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("¿Qué precio tiene el 2do producto? ");
            p2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("¿Qué precio tiene el 3er producto? ");
            p3 = Convert.ToInt32(Console.ReadLine());

            t = p1 + p2 + 3;
            ivaT = t * iva;
            subt = t - ivaT;
            Console.WriteLine("El toal es: " + t);
            Console.WriteLine("El subtotal es: " + subt);
            Console.WriteLine("El IVA es: " + ivaT);
        }
    }
}
    

