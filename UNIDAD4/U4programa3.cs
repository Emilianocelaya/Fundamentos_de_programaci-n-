using System;

namespace U4programa3 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double farenheih = 0, kelvin = 0;
            int temperaturaf;

            Console.WriteLine("ingresar la cantidad de temperaturas a procesar: ");
            temperaturaf = Convert.ToInt32(Console.ReadLine());

            double[] temp = new double[temperaturaf];

            for (int i = 0; i < temperaturaf; i++)
            {
                Console.WriteLine("ingrese la temperatura en grados celcius: ");
                temp[i] = Convert.ToDouble(Console.ReadLine());

                farenheih = temp[i] * (9 / 5) + 32;
                Console.WriteLine("la temperatura en grados  farenheih es: " + farenheih);

                kelvin = temp[i] + 273.15;
                Console.WriteLine("la temperatura en grados  kelvin es: " + kelvin);
            }

                    }
        }
    }

