package encuentros_19a24_ejercicio1.entidades;


public class CuentaBancaria {
    //atributos
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    
    //constructores
    public CuentaBancaria(){
    }
    
    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual){
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
    // GETTER & SETTER
    //numero cuenta
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    
    //dni cliente
    public long getDniCliente(){
        return dniCliente;
    }
    
    public void setDniCliente(long dniCliente){
        this.dniCliente = dniCliente;
    }
    
    //saldo actual
    
    public double getSaldoActual(){
        return saldoActual;
    }
    
    public void setSaldoActual(double saldoActual){
        this.saldoActual = saldoActual;
    }

    
}
