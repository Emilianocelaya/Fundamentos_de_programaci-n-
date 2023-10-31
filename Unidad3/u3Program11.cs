using System;

namespace U3programa11 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c;
            for (c = 1; c <= 100; c++)
            {
                Console.WriteLine(c);
            }
            for (int i = 1; i >= 100; i--)
            {
                Console.WriteLine(i);
            }
        }
    }
}
