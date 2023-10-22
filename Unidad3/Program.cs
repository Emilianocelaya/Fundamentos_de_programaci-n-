using System;

namespace U3programa2 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int C1, C2, C3, C4, C5, C6, prom;
            Console.WriteLine("Escribe la primer calificacion: ");
            C1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe la segunda calificacion: ");
            C2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe la tercer calificacion: ");
            C3 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe la cuarta calificacion: ");
            C4 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe la quinta calificacion: ");
            C5 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe la sexta calificacion: ");
            C6 = Convert.ToInt32(Console.ReadLine());
            prom = (C1 + C2 + C3 + C4 + C5 + C6) / 6;
            Console.WriteLine("El resultado es: " + prom);
            if (prom >= 70)
            {
                Console.WriteLine("Aprobado!!");
            }
            else
            {
                Console.WriteLine("Reprobado!!");
            }
        }
    }
}
