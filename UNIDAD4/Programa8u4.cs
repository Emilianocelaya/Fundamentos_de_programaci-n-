using System;

class Program
{
    static void Main()
    {
        int[] numeros = { 4, 22, 31, 46, 57, 63, 72, 81, 92, 35 };

        Console.WriteLine("Números Pares:");
        foreach (int num in numeros)
        {
            if (EsPar(num))
            {
                Console.Write(num + " ");
            }
        }

        Console.WriteLine("\nNúmeros Impares:");
        foreach (int num in numeros)
        {
            if (!EsPar(num))
            {
                Console.Write(num + " ");
            }
        }
    }

    static bool EsPar(int numero)
    {
        return numero % 2 == 0;
    }
}

