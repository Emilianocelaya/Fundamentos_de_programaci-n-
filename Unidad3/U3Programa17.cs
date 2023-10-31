using System;

namespace U3programa17 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            char salir;

            do
            {
                Console.WriteLine("Bienvenido a una sala de ejecucion");
                Console.WriteLine("Escriba n para no condenar a muerte");
                salir = Convert.ToInt32(Console.ReadLine()).charAt(0);
            } while (salir != 'n');
        }
    }
}
