package banco;


import java.util.Scanner;


public class Banco {

    public static void main(String[] args) {
    //crear un onjeto de la clase cuenta bancaria 
    //ejecutar todos los metodos desde el objeto 
    
    int numCuenta;
    String nomCliente;
    float saldo;
    int codcvv;
    Cuenta_bancaria cuentaB;
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("¿Numero de cuenta? ");
    numCuenta = entrada.nextInt();//lee un entero 
    entrada.nextLine();//limpia el buffer 
    
    
    System.out.println("¿ nomCliente? ");
    nomCliente = entrada.nextLine(); 
    
    System.out.println("¿ saldo inicial ");
    saldo = entrada.nextFloat();
    
    System.out.println("¿ cvv ? ");
    codcvv = entrada.nextInt();
    
     cuentaB = new Cuenta_bancaria( numCuenta, nomCliente, saldo, codcvv);
     double cantidad ;
     System.out.println("¿que cantidad desea retirar ? ");
     cantidad = entrada.nextDouble();
     cuentaB.retirar(cantidad);
     System.out.println("¿ el saldo actual es  ? " + cuentaB.consultarSaldo());
    System.out.println("¿que cantidad desea retirar ? ");
     cantidad = entrada.nextDouble();
     cuentaB.retirar(cantidad);
     System.out.println("¿ el saldo actual es  ? " + cuentaB.consultarSaldo());
    
   } 
}
