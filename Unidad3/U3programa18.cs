using System;

namespace U3programa18 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c;
            double salario = 1500, a = 1, total = 1;
            for (c = 1; c <= 6; c++)
            {
                Console.WriteLine("Sueldo por año: " + salario);
                a = salario * 0.10;
                salario = salario + a;
            }
            total = total + salario;
            Console.WriteLine("El sueldo a cabo dentro de 6 años es: " + total);
        }
    }
}
