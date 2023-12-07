
using System;
using System.Text;

class Program
{
    static void Main()
    {
        int longitud = 8;
        string contrasena = Aleatorio(longitud);
        Console.WriteLine("password: " + contrasena);
    }

    public static string Aleatorio(int longitud)
    {
        string caracteres = "ABCDEFGHIJK123456789*-_.";
        Random random = new Random();
        StringBuilder cadena = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++)
        {
            int indiceCaracter = random.Next(caracteres.Length);
            cadena.Append(caracteres[indiceCaracter]);
        }
        return cadena.ToString();
    }
}
