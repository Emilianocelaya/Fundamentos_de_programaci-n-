using System;
namespace practica_11
{
    internal class program
    {

        static void Main(string[] args)
        {
            int E;
            Console.WriteLine("Ingresa la edad: ");
            E = Convert.ToInt32(Console.ReadLine());

            if (E >= 18)
            {
                Console.WriteLine("Eres mayor de edad. ");
            }
            else
            {
                Console.WriteLine("Eres menor de edad. ");
            }
            Console.ReadLine();
        }
    }
}