using System;

namespace U3programa22 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int suma = 0, num;
            do
            {
                Console.WriteLine("Ingrese el valor de num: ");
                num = Convert.ToInt32(Console.ReadLine());
                suma = suma + num;
            } while (num != 0);
            Console.WriteLine("El resultado es: " + suma);
        }
    }
}
