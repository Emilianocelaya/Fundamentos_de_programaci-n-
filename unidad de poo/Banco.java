package banco;

import java.util.Scanner;

public class Banco {

public static void main(String[] args) {
//crear un objeto de la clase CuentaBancaria
//ejecutar todos los métodos desde el objeto
int numCuenta;
String nombCliente;
float saldo;
int cvv;
double cantidad;
Cuenta_bancaria cuentaB=null;
Cuenta_bancaria cuentaB2=null;
Scanner entrada = new Scanner(System.in);
int opc;
do {
System.out.println("Seleccione una opcion");
System.out.println("1. Crear 2 cuentas");
System.out.println("2. Depositar");
System.out.println("3. Retirar");
System.out.println("4. Consultar saldo");
System.out.println("5. Mostrar datos ");
System.out.println("6. Salir");
opc=entrada.nextInt();entrada.nextLine();
switch(opc){
case 1: // crear la cuenta
System.out.println("¿Número de cuenta? ");
numCuenta = entrada.nextInt(); //lee un entero
entrada.nextLine(); //limpia el buffer
System.out.println("¿Nombre del cliente? ");
nombCliente = entrada.nextLine();//lee un String
System.out.println("¿Saldo inicial? ");
saldo = entrada.nextFloat();//lee un float
System.out.println("¿CVV? ");
cvv = entrada.nextInt();
cuentaB = new Cuenta_bancaria(numCuenta,nombCliente,saldo,cvv);
System.out.println("¿Número de cuenta? ");
numCuenta = entrada.nextInt(); //lee un entero
entrada.nextLine(); //limpia el buffer
System.out.println("¿Nombre del cliente? ");
nombCliente = entrada.nextLine();//lee un String
System.out.println("¿Saldo inicial? ");
saldo = entrada.nextFloat();//lee un float
System.out.println("¿CVV? ");
cvv = entrada.nextInt();
cuentaB2 = new Cuenta_bancaria(numCuenta,nombCliente,saldo,cvv);
break;
case 2: // depositar en la cuenta
System.out.println("¿Qué cantidad desea depositar? ");
cantidad = entrada.nextDouble();
cuentaB.depositar(cantidad);
cuentaB.calcularComision();
cuentaB.calcularComision(cantidad);
break;
case 3: // retirar de la cuenta
System.out.println("¿Qué cantidad desea retirar? ");
cantidad = entrada.nextDouble();
cuentaB.retirar(cantidad);
break;
case 4: // consultar saldo
System.out.println("El saldo actual es "+cuentaB.consultarSaldo());
break;
case 5: //Mostrar los datos de la cuenta
System.out.println(cuentaB.toString());
System.out.println("Número de cuenta "+
cuentaB.getNumCuenta());
case 6:
System.out.println("Adios");
break;
default: System.out.println("Opción no válida");
}
}while(opc!=6);

System.out.println(cuentaB.toString());
}
}
