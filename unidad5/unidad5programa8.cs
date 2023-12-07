using System;

namespace unidad5programa8 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
           
            Random ale = new Random();
          
            int x = ale.Next(1, 7);
            Console.WriteLine("Numero de la cara del dado: " + x);

        }
    }
}