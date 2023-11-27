using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int diagonal[,] = { { 1,5,6},{ 3,10,3},{ 17,8,9 } };
            Console.WriteLine("diagonal principal: ");
            for (int c = 0; c < diagonal.length; c++)
            {
                Console.WriteLine(diagonal[c][c] + " ");
            }
            Console.WriteLine("diagonal inversa: ");
            for (int i = 0; i < 3; c++)
            {
                Console.WriteLine(diagonal[i][diagonal.length - 1 - i] + " ");
            }
        }
    }


}




