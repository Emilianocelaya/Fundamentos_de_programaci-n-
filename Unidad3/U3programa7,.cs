namespace U3programa7 // Note: actual namespace depends on the project name.
{
    internal class Temperatura
    {
        static void Main(string[] args)
        {
            double T;
            Console.WriteLine("¿Qué temperatura hay hoy?");
            T = double.Parse(Console.ReadLine());

            if (T >= 27)
            {
                Console.WriteLine("Hace calor");
            }
            else if (T < 27 && T >= 20)
            {
                Console.WriteLine("El clima hoy es agradable");
            }
            else
            {
                Console.WriteLine("Hace frío");

            }
        }
    }
}
