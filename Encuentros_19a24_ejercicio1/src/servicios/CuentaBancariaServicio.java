/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
package servicios;

import encuentros_19a24_ejercicio1.entidades.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicio {
    
    Scanner lector = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta() {
        
        //a) pedir datos numeroCuenta(entero),  dniCliente(entero largo),  saldoActual. 
        System.out.println("Ingrese su numero de cuenta");
        int numeroCuenta = lector.nextInt();
        
        System.out.println("Ingrese su numero de dni");
        long dniCliente = lector.nextLong();
        
        System.out.println("Ingrese su saldo inicial");
        double saldoActual = lector.nextDouble();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
    
    //b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
    //se le sumará al saldo actual.
    
    public void ingresar(CuentaBancaria cuenta, double monto) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + monto);
        System.out.println("Ha ingresado: "+ monto);
        System.out.println("Su saldo actual es:  " + cuenta.getSaldoActual());
    }
    
    //c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
    //restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
    //retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    
    public void retirar (CuentaBancaria cuenta, double monto){
        cuenta.setSaldoActual(cuenta.getSaldoActual() - monto);
        System.out.println("Retiro " + monto);
        System.out.println("SU saldo actual es: " + cuenta.getSaldoActual());
    }
    
  //d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
  //Validar que el usuario no saque más del 20%.
    
    public static void extraccionRapida(CuentaBancaria cuenta, double extracto){
        //Para evitar mutabilidad creo en memoria 2 variables, la primera 
        double saldoActual = cuenta.getSaldoActual();
        //Se verfica que el extracto no supere el  0.2 del saldo
        if (extracto>saldoActual*0.20) {
            System.out.printf("ERROR, MONTO DE EXTRACCION SUPERIOR A LO PERMITIDO, %f%n" + saldoActual);
        }
        double actSaldo = saldoActual - extracto;
        System.out.println("Ha extraido: " + extracto);
        cuenta.setSaldoActual(actSaldo);
        
    }
    
    //e) Método consultarSaldo: permitirá consultar el saldo disponible en la
    //cuenta.
    
    public void consultarSaldo (CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        System.out.println("Su saldo actual es: " + saldoActual);
    }
    
    //f) Método consultarDatos: permitirá mostrar todos los datos de la
    //cuenta.
    
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Su numero de cuenta es: " + cuenta.getNumeroCuenta());
        System.out.println("Su DNI es: " + cuenta.getDniCliente());
        System.out.println("Su saldo actual es: " + cuenta.getSaldoActual());
    }

}
