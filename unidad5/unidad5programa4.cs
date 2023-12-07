namespace unidad5programa4;

class Numero_P
{
    public static void Main(string[] args)
    {
        Console.Write("escribe un numero: ");
        int numero = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine(numero + " " + primo(numero));
    }
    public static string primo(int x)
    {
        int c = 0;
        string p;
        for (int i = x; i > 0; i--)
        {
            if (x % i == 0)
            {
                c++;
            }
        }
        if (c == 2)
        {
            p = "es  primo";
        }
        else
        {
            p = "no es  primo";
        }
        return p;
    }

}
