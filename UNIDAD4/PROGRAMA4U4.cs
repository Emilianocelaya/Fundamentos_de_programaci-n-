using System;

namespace MyApp
{
    internal class Negativo
    {
        static void Main(string[] args)
        {

            int n = 0, num;
            Console.WriteLine("Ingresa los números: ");
            num = Convert.ToInt32(Console.ReadLine());

            int[] neg = new int[num];

            for (int ne = 0; ne < neg.Length; ne++)
            {
                Console.WriteLine("Escribe un número en indice " + ne + ": "); ;
                neg[ne] = Convert.ToInt32(Console.ReadLine());

                if (neg[ne] < 0)
                {
                    n++;
                }
                Console.WriteLine("Hay un total de " + n + " números negativos.");
            }

        }
    }
}
