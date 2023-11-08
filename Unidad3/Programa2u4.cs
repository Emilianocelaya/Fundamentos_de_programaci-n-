using System.Net.NetworkInformation;

using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double[] cali = new double[10] {9, 8,  7, 7, 8, 8, 9, 8, 6, 7,};
            double prom = 0, suma = 0;
            for (int i = 0; i < 10; i++)
            {
                suma = suma + cali[i];
                prom = suma / 10;
            }
            Console.WriteLine("tu promedio es de: " + prom);
        }
    }
}
