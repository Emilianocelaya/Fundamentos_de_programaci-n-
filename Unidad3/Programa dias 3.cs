using System;

namespace U3programa3 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int dia;
            Console.WriteLine ("Programa para los dias de la semana");
            Console.WriteLine("introdusca un numero para saber que dia es: ");
            dia = Convert.ToInt32 (Console.ReadLine());
            switch (dia) 
            {
                case 1:
                    Console.WriteLine("Es lunes");
                    break;
                case 2:
                    Console.WriteLine("Es Martes");
                    break;
                case 3:
                    Console.WriteLine("Es Miercoles");
                    break;
                case 4:
                    Console.WriteLine("Es Jueves");
                    break;
                case 5:
                    Console.WriteLine("Es Viernes ");
                    break;
                case 6:
                    Console.WriteLine("Es Sabado ");
                    break;
                case 7:
                    Console.WriteLine("Es Domingo ");
                    break;
                default:
                    Console.WriteLine("no entra del 1 al 7 ");
                    break;
            }

        }
    }

}
    

