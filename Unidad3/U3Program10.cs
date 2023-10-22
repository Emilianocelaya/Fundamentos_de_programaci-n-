using System;

namespace U3programa10 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int Lado, Perimetro, Apotema, area;
            Console.WriteLine("declarar el valor de L ");
            Lado  = Convert.ToInt32(Console.ReadLine());
            Perimetro = Lado * 6;
            Console.WriteLine("declarar el valor del apotema ");
            Apotema = Convert.ToInt32(Console.ReadLine());
            area = (Perimetro * Apotema) / 2;
            Console.WriteLine("El ´área del hexagono es: " + area);
        }
    }
}
    
