using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {

            int[] cal = { 9, 8, 7, 7, 8, 8, 9, 8, 6, 7, };
            double promedio = 0, suma = 0;

            for (int i = 0; i < 10; i++)
            {
                suma = suma + cal[i];
                promedio = suma / 10;
            }
            Console.WriteLine("El promedio de tus califiaciones es: " + promedio);
        }
    }
}
    




