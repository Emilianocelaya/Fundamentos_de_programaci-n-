using System;
namespace practica_8
{
    internal class program
    {

        static void Main(string[] args)
        {
            int p1, p2, p3, I = 16;
            float multiplicacion, suma;

            Console.WriteLine("Declarar valor de la variable  p1: ");
            p1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Declarar valor de la variable  p2: ");
            p2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Declarar valor de la variable  p3: ");
            p3 = Convert.ToInt32(Console.ReadLine());
            multiplicacion = (p1 + p2 + p3) * I;

            suma = (p1 + p2 + p3);
            Console.WriteLine("El resultado de los productos sin iva  es: " + suma);

            Console.WriteLine("El resultado del producto con iva  es: " + multiplicacion);
        }
    }
}
