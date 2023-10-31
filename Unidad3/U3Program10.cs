using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int h, horasextra;
            double pago, sueldosemanal = 0;
            Console.WriteLine("¿Cuantas horas trabajaste?");
            ht = Convert.ToInt32(Convert.ToDouble(Console.ReadLine()));
            Console.WriteLine("¿Cuanto es el pago por hora?");
            pago = Convert.ToInt32(Convert.ToInt32(Console.ReadLine()));

            if (h<= 40)
            {
                sueldosem = h * pago;
                Console.WriteLine("Recibiras un total de $" + sueldosemanal);
            }
            else
            {
                hrext = hrtrab - 40;
                sueldosem = 40 * pago + horasextra * (pago * 2);
                Console.WriteLine("Por trabajar " + horasextra + " horas extra, tu paga es de " + sueldosemanal);


            }
        }
    }
}
