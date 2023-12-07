using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese el precio del producto: ");
            double p = Convert.ToDouble(Console.ReadLine());
            Console.Write("Cantidad de productos: ");
            int n = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Subtotal del producto: " + sub(p, n) + " $");
            Console.WriteLine("IVA del producto: " + iva(p) + " $");
            Console.WriteLine("Total a pagar: " + total(p, n) + " $");
        }
        //IVA del producto
        public static double iva(double a)
        {
            double IVA = 0.16;
            double r = a * IVA;
            return r;
        }
        //SUBTOTAL
        public static double sub(double pr, int sub)
        {
            double r = pr * sub;
            return r;
        }
        // TOTAL
        public static double total(double pr, double iva)
        {
            double IVA = 0.16;
            double r = (pr * iva) + ((pr * iva) * IVA);
            return r;
        }
    }
}
    