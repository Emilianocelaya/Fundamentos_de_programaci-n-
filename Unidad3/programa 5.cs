using System;

namespace U3programa5 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double p1, p2, p3, total;
            Console.WriteLine("escribe precio de 1: ");
            p1=Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("escribe precio de 2: ");
            p2 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("escribe precio de 3: ");
            p3 = Convert.ToDouble(Console.ReadLine()); ;
            total = p1 + p2 + p3;
            if (total >= 1500)
            {
                total = total - (total * 0.30);
                Console.WriteLine("tiene 30 porciento de descuento: " + total);
            }
            else if (total < 1500 && total >= 1000)
            {
                total = total - (total * 0.20);
                Console.WriteLine("tiene 20 porciento de descuento: " + total);
            }
            else if (total < 1000 && total >= 700)
            {
                total = total - (total * 0.10);
                Console.WriteLine("tiene 10 porciento de descuento: " + total);
            }
        }
    }
}

        
    

