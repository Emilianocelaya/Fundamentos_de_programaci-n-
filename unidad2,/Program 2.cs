using System;

namespace Programa2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string nombre = "Gamaliel ", apellidos = "Zapata Alonso", completo;
            completo = nombre + apellidos;
            int a = 5, b = 23, suma;
            suma = a + b;
            Console.WriteLine( " * * Bienvenido * * " + completo + " * *" );
            Console.Write( "la operacion suma de A=" + a + " B=" + b );
            Console.Write( $"Tu resultado es {suma}" );
            Console.WriteLine( " -- Gracias : )"); 
        }
    }
}