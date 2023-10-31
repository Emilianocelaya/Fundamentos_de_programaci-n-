using System;

namespace U3programa9 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double hr, suma = 0;
           Console.WriteLine("escribe las horas : ");
            hr = Convert.ToInt32(Console.ReadLine());
            if (hr > 1.01 && hr <= 2.00)
                suma = suma + 5;
            else if (hr > 1.01 && hr <= 2.00)
                suma = suma + 10;
            Console.WriteLine("total  $ +suma : ");
        }
    }
}
