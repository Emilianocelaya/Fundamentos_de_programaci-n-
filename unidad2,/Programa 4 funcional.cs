using System;

namespace proyecto4 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int Y ,A; 
            float suma;

            Console.WriteLine("aignar valor a la variable Y: ");
            Y = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("asignar valor a la variable A. ");
            A = Convert.ToInt32(Console.ReadLine());
            suma = (Y + A + 3);
            Console.WriteLine("El resultado de la suma es: " + suma);

        }
    }
}
