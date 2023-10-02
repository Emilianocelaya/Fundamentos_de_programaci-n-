using System;
namespace practica_10
{
    internal class program
    {

        static void Main(string[] args)
        {
            int P, A;
            float multiplicacion, division;

            Console.WriteLine("Declarar valor del perimetro  P: ");
            P = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Declarar valor del apotema  A: ");
            A = Convert.ToInt32(Console.ReadLine());



            multiplicacion = (P * A);
            Console.WriteLine("El resultado del perimetro  es: " + multiplicacion);

            division = (P * A) / 2;
            Console.WriteLine("El Area es : " + division);
        }
    }


}