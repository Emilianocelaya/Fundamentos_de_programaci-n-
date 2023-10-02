using System;
namespace practica_7
{
    internal class program
    {

        static void Main(string[] args)
        {
            int M, P = 3;
            float multiplicacion;

            Console.WriteLine("Declarar valor de la variable  M: ");
            M = Convert.ToInt32(Console.ReadLine());

            multiplicacion = (M * P);
            Console.WriteLine("El resultado de la operacion es: " + multiplicacion);

        }
    }
}
