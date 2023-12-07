namespace ProgramaU5_3;
class Conversiones
{
    static void Main(string[] args)
    {
        int p;
        double c;
        Console.WriteLine("1. Temperatura C° a F°.");
        Console.WriteLine("2. Temperatura F° a K°.");
        Console.WriteLine("3. Medidas pulgadas a centimetros.");
        Console.WriteLine("4. Horas a segundos.");
        do
        {
            Console.Write("Elija el numero conervsion a realizar: ");
            p = Convert.ToInt32(Console.ReadLine());

            switch (p)
            {
                case 1:
                    Console.Write("Ingrese los gardos centigrados: ");
                    c = Convert.ToDouble(Console.ReadLine());
                    Console.Write(c + " C equivale a: " + f(c) + " F");
                    break;
                case 2:
                    Console.WriteLine(k());
                    break;
                case 3:
                    cm();
                    break;
                case 4:
                    h();
                    break;

                default:
                    Console.WriteLine("No entra en una de las opciones. ");
                    break;
            }
        } while (p < 1 || p > 4);
    }
    // 1. C a F
    public static double f(double c)
    {
        double r = (c * 1.8) + 32;
        return r;
    }
    //2. F a K
    public static double k()
    {
        double f, r;
        Console.Write("Ingrese la temperatura en farenheit: ");
        f = Convert.ToDouble(Console.ReadLine());
        r = (f - 32) - (5 / 9) + 273.15;
        return r;
    }
    //3. pulgadas a centimetros
    public static void cm()
    {
        double p, r;
        Console.Write("Ingrese la medidad en pulgadas: ");
        p = Convert.ToDouble(Console.ReadLine());
        r = p * 39.37;
        Console.Write(p + " in equivalen a: " + r + " cm");
    }
    //4. hrs a seg
    public static void h()
    {
        double h, seg;
        Console.Write("Ingrese las horas a convertir: ");
        h = Convert.ToDouble(Console.ReadLine());
        seg = h * 3600;
        Console.Write(h + " hrs equivalen a: " + seg + " seg");

    }
}
