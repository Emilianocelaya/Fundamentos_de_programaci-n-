using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int hrtrab, hrext;
            double pago, sueldosem = 0;
            Console.WriteLine("¿Cuantas horas trabajaste?");
            hrtrab = Convert.ToInt32(Convert.ToDouble(Console.ReadLine()));
            Console.WriteLine("¿Cuanto es el pago por hora?");
            pago = Convert.ToInt32(Convert.ToInt32(Console.ReadLine()));

            if (hrtrab <= 40)
            {
                sueldosem = hrtrab * pago;
                Console.WriteLine("Recibiras un total de $" + sueldosem);
            }
            else
            {
                hrext = hrtrab - 40;
                sueldosem = 40 * pago + hrext * (pago * 2);
                Console.WriteLine("Por trabajar " + hrext + " horas extra, usted recibe un total de $" + sueldosem);


            }
        }
    }
}