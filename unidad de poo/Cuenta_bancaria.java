package banco;

public class Cuenta_bancaria {
    //* 1. Crear la clase
    //* 2. Defiir los atributos
    int numCuenta;
    String nomCliente;
    float saldo;
    int codcvv;
    //* 3. Definir el constructor

    public Cuenta_bancaria(int numCuenta, String nomCliente, float saldo, int codcvv) {
        this.numCuenta = numCuenta;
        this.nomCliente = nomCliente;
        this.saldo = saldo;
        this.codcvv = codcvv;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public float consultarSaldo() {
        return saldo;
    }

    public int getCodcvv() {
        return codcvv;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setCodcvv(int codcvv) {
        this.codcvv = codcvv;
    }
    
    @Override
    public String toString() {
        return "Cuenta_bancaria{" + "numCuenta=" + numCuenta + ", nomCliente=" + nomCliente + ", saldo=" + saldo + ", codcvv=" + codcvv + '}';
    }
   //metodo depositar recibe una cantidad que 
    //se sumara al saldo 
    void depositar(double cantidad){
        saldo += cantidad;
        //la instruccion equivale a 
        //saldo = salo + cantidad 
        
    
    } 
    //metodo retirar resive una cantidad que sera restada al saldo 
    void retirar(double cantidad){
        if (haysaldo(cantidad))
        saldo-= cantidad;
        else
            System.out.println("fondos insuficientes");
    }
    //el metodo hay saldo retorna verdadero si el saldo es mayor o igual a una cantidad o retorna s falso en caso contrario 
    boolean haysaldo(double cantidad){
        if (saldo >= cantidad)
            return true;
        else
            return false;
    }
    }

