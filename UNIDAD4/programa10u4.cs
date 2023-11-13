using System;

class Program
{
    static void Main()
    {
        string[] paises = { "Namekuzein", "España", "china", "australia", "japon", "inglaterra" };


        double longitudPromedio = CalcularLongitudPromedio(paises);
        Console.WriteLine("Longitud Promedio de las Palabras: " + longitudPromedio);
    }

    static double CalcularLongitudPromedio(string[] arreglo)
    {
        int totalCaracteres = 0;

        foreach (string palabra in arreglo)
        {
            totalCaracteres += palabra.Length;
        }

        return (double)totalCaracteres / arreglo.Length;
    }
}


