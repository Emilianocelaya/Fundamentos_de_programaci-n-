﻿using System;

namespace U3programa1 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int mes;
           Console.WriteLine("Programa para los MESES DEL AÑO");
            Console.WriteLine("introdusca un numero para saber que MES es: ");
            mes = Convert.ToInt32(Console.ReadLine());
            switch (mes)
            {
                case 1:
                    Console.WriteLine("Es Enero");
                    break;
                case 2:
                    Console.WriteLine("Es Febrero");
                    break;
                case 3:
                    Console.WriteLine("Es Marzo");
                    break;
                case 4:
                    Console.WriteLine("Es Abril");
                    break;
                case 5:
                    Console.WriteLine("Es Mayo ");
                    break;
                case 6:
                    Console.WriteLine("Es Junio ");
                    break;
                case 7:
                    Console.WriteLine("Es Julio ");
                    break;
                case 8:
                    Console.WriteLine("Es Agosto ");
                    break;
                case 9:
                    Console.WriteLine("Es Septiembre ");
                    break;
                case 10:
                    Console.WriteLine("Es Octubre  ");
                    break;
                case 11:
                    Console.WriteLine("Es Noviembre ");
                    break;
                case 12:
                    Console.WriteLine("Es Diciembre ");
                    break;

            }

        }
    }

}
    
