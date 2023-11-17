
using System;
class HelloWorld {
  static void Main() {
      int c=0;

      Console.WriteLine("Ingresa la  fruta:");
      c = Int32.Parse(Console.ReadLine());
      
      string[] fruta = new string[c];
      
      for(int i=0;i<c;i++)
      {
        Console.WriteLine("Ingresa la fruta:");
        fruta[i] = Console.ReadLine();
        
      }
      
      for(int j=c-1; j>=0; j--)
        {
        Console.WriteLine("fruta al revez:" + fruta[j]);
        }
  
  }
}
