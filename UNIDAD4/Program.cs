using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {

        }
    }





    namespace U4programa15 // Note: actual namespace depends on the project name.
    {
        internal class Program
        {
            static void Main(string[] args)
            {
                int[] matriz = new int[3];
                matriz[0] = 3;
                matriz[1] = 5;
                matriz[2] = 2;

                Console.WriteLine("Contenido del arreglo");
                for (int i = 0; i < 3; i++)
                {
                    Console.WriteLine(matriz[i]);

                }
                double media;
                media = (matriz[0] + matriz[1] + matriz[2]) / 3;
                Console.WriteLine("La media de los arreglos en la matriz es: " + media);
            }
        }
    }
}




   
    

