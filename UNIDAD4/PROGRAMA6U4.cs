using System;

namespace PROGRAMA6U4 // Note: actual namespace depends on the project name.
{
    internal class PROGRAMA6U4
    {
        static void Main(string[] args)
        {
            int[] numeros = { 3, 9, 2, 65, 90, 32, 33, 67 };

            int[] arregloaux = OrdenarArreglO(numeros);

            Console.WriteLine("el arreglo ordenado es :");
            foreach (int num in arregloaux)
            {
                Console.Write(num + " ");
            }
        }

        static int[] OrdenarArreglO (int[] arreglo)
        {
            int[] arregloaux = new int[arreglo.Length];
            Array.Copy(arreglo, arregloaux, arreglo.Length);

            for (int i = 0; i < arregloaux.Length - 1; i++)
            {
                for (int j = 0; j < arregloaux.Length - 1 - i; j++)
                {
                    if (arregloaux[j] > arregloaux[j + 1])
                    {
                        int temp = arregloaux[j];
                        arregloaux[j] = arregloaux[j + 1];
                        arregloaux[j + 1] = temp;
                    }
                }
            }

            return arregloaux;
        }
    }

}
