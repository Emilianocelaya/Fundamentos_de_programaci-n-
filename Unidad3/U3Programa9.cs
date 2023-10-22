using System;

namespace U3PROGRAMA9 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
           
            int N1, N2, suma, resta, multiplicacion, division;
            Console.WriteLine("Escribe un número:");
            N1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe un número:");
            N2 = Convert.ToInt32(Console.ReadLine());

            suma = N1 + N2;
            Console.WriteLine("El resultado de la suma es: " + suma);

            resta = N1 - N2;
            Console.WriteLine("El resultado de la resta es: " + resta);

            multiplicacion = N1 * N2;
            Console.WriteLine("El resultado de la multiplicación es: " + multiplicacion);

            division = N1 / N2;
            Console.WriteLine("El resultado de la división es: " + division);
        }
    }
}
    

