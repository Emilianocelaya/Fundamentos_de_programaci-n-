using System;
namespace practica_6
{
    internal class program
    {

        static void Main(string[] args)
        {
            int C, F = 33;
            float multiplicacion;

            Console.WriteLine("Declarar valor de la variable  C: ");
            C = Convert.ToInt32(Console.ReadLine());

            multiplicacion = (C * F);
            Console.WriteLine("El resultado de la operacion es: " + multiplicacion);
        }
    }
}