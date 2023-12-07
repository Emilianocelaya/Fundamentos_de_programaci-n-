using System;

namespace unidad5programa5 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {

           string p = "";
            Console.Write("escribe una palabra : ");
            p = Console.ReadLine();
            Console.WriteLine(p + " esta palabra esta conformada por : " + palabras(p) + " letras");
        }
        public static int palabras(string x)
        {
            int s = x.Length;
            return s;
        }
    }
}
    

