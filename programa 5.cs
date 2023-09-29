using System;

namespace programa5 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int B, A;
            float area;


         Console.WriteLine("Escriba el valor de la variable B: ");
            B = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escriba el valor de la variable A: ");
            A = Convert.ToInt32(Console.ReadLine());
            area = (B + A) / 2;
            Console.WriteLine("El resultado de la operacion es: " + area);
            
            int L1, L2, L3;
            float perimetro;
            Console.WriteLine("Escriba el valor de la variable L1: ");
            L1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escriba el valor de la variable L2: ");
            L2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escriba el valor de la variable L3: ");
            L3 = Convert.ToInt32(Console.ReadLine());
            perimetro = (L1 + L2 + L3);
           Console.WriteLine("EL resultado de el perimetro es: " + perimetro);
        }
    }
}
