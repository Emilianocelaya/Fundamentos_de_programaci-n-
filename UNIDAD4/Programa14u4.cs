using System;

namespace PROGRAMA14U4 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] cali = new int[3];
            cali[0] = 5;
            cali[1] = 7;
            cali[2] = 9;


            Console.WriteLine("los datos son");
            for (int i = 0; i < 3; i++)
            {

                Console.WriteLine(cali[i]);
            }
            int suma;
            suma = cali[0] + cali[1] + cali[2];
            Console.WriteLine("la suma de los datos es " + suma);



        }
    }

}
    


