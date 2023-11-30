using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int opcion;
            Console.WriteLine("elige la convercion a realizar ");
            Console.WriteLine("temperatura °c a °f ");
            Console.WriteLine("temperatura °f a °k ");
            Console.WriteLine("medida pies  a metros ");
            Console.WriteLine("tiempo horas  a segundos ");
            opcion = Convert.ToInt32(Console.ReadLine());
            switch (opcion)
            {
                case 1:
                    double C;
                    Console.Write("escribe los °c a convertir");
                    C = Convert.ToInt32(Console.ReadLine()); 
                    break;
                case 2:
                    Console.WriteLine("opcion 2");
                    break;
                case 3:
                    medida();
                    break;
                case 4:
                    Tiempo();
                    break;

                    default: Console.WriteLine("la opcion es incorrecta");
                    break;

            }//switch

        } //Main
        public static  double temperaturaCF(double C)
        {
            double resultados = (C * 1.8) + 32;
            return resultados;
        }
       
        public static double temperaturaFK()
        {
            double F, resultados;
            Console.Write("ingrese la temperatura en celsius");
             F = Convert.ToDouble(Console.ReadLine);
            resultados = (F - 32) * (5 / 9) + 275.16;
            return resultados;

        }
        public static void medida()
        {
            double p, resultado;
            Console.Write("escribe la medida en pulgadas ");
            p = Convert.ToDouble(Console.ReadLine());
            resultado = p / 39.37;
            Console.WriteLine("ti resultado es: " + resultado);


        }
        public static double Tiempo()
        {
            double h;
            Console.Write("escrib eel tiempo en horas ");
            h = Convert.ToDouble(Console.ReadLine());
            return h * 3600;
        }




    }
}

