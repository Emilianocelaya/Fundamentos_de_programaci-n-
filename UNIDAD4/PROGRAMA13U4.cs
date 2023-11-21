using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float[][] temp = new float[5][];
            for (int f = 0; f < 5; f++)
            {
                temp[f] = new float[7];
                for (int c = 0; c < 7; c++)
                {
                    Console.WriteLine("Escribe temperatura en (" + f + ", " + c + ")");

                    temp[f][c] = float.Parse(Console.ReadLine());
                }
            }
            float[][] TempF = new float[5][];
            for (int f = 0; f < 5; f++)
            {
                TempF[f] = new float[7];
                for (int c = 0; c < 7; c++)
                {
                    TempF[f][c] = (temp[f][c] * 9 / 5) + 32;
                    Console.Write("Grados Farenheit en (" + f + ", " + c + ")" + TempF[f][c] + ",");
                }
                Console.WriteLine();
            }
        }
    }
}

        
    

