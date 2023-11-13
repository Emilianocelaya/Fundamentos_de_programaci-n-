using System;

class Program
{
    static void Main()
    {
        double[] numeros = { 2, 4, 6, 3, 6, 8, 1, 5, 9, 13 };

        double media = CalcularMedia(numeros);
        Console.WriteLine("Media: " + media);

        double mediana = CalcularMediana(numeros);
        Console.WriteLine("Mediana: " + mediana);
    }

    static double CalcularMedia(double[] arreglo)
    {
        double suma = 0;

        foreach (double num in arreglo)
        {
            suma += num;
        }

        return suma / arreglo.Length;
    }


    static double CalcularMediana(double[] arreglo)
    {
        Array.Sort(arreglo);

        int n = arreglo.Length;

        if (n % 2 == 0)
        {
            int indice1 = n / 2 - 1;
            int indice2 = n / 2;
            return (arreglo[indice1] + arreglo[indice2]) / 2.0;
        }
        else
        {
            int indice = n / 2;
            return arreglo[indice];
        }
    }
}

