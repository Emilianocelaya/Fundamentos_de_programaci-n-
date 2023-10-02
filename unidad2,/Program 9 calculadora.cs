using System;
namespace practica_8
{
    internal class program
    {

        static void Main(string[] args)
        {
            int N1, N2;
            float suma, resta, multiplicacion, division;

            Console.WriteLine("Declarar valor de la variable  N1: ");
            N1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Declarar valor de la variable  N2: ");
            N2 = Convert.ToInt32(Console.ReadLine());

            suma = (N1 + N2);
            Console.WriteLine("El resultado de la suma  es: " + suma);

            resta = (N1 - N2);
            Console.WriteLine("El resultado de la suma  es: " + resta);

            multiplicacion = (N1 * N2);
            Console.WriteLine("El resultado de la suma  es: " + multiplicacion);

            division = (N1 / N2);
            Console.WriteLine("El resultado de la suma  es: " + division);
        }
    }
}