using System;
namespace ProgramaU5_1;

class Calculadora
{
    static void Main(string[] args)
    {
        Console.WriteLine("Suma: " + suma(7, 8));
        Console.WriteLine("Resta: " + resta(10, 2));
        Console.WriteLine("Multiplicacion: " + multi(3, 8));
        Console.WriteLine("division: " + divicion(10, 2));
    }
    // SUMA
    public static int suma(int a, int b)
    {
        int res = a + b;
        return res;
    }
    // RESTA
    public static int resta(int a, int b)
    {
        int res = a - b;
        return res;
    }
    // MULTIPLICACION
    public static int multi(int a, int b)
    {
        int res = a * b;
        return res;
    }
    // DIVISION
    public static int divicion(int a, int b)
    {
        int res = a / b;
        return res;
    }
}
