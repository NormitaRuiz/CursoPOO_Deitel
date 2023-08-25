package com.pe.deitel.test;

import java.util.Scanner;

import com.pe.deitel.clases.Cuenta;

public class PruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
		Cuenta cuenta2 = new Cuenta("John Blue", -7.53);
		
		//muestra Saldo inicial del objeto

		System.out.printf("El saldo de %s: $%.2f%n", cuenta1.obtenetNombre(), cuenta1.obtenerSaldo());
		System.out.printf("El saldo de %s: $%.2f%n", cuenta2.obtenetNombre(), cuenta2.obtenerSaldo());
		
		//crea un objeto scanner para obtnere la entrada de la ventana de comandos
		Scanner scanner=new Scanner(System.in);//obtiene entrada del usuario
		
		System.out.println("Escriba el monto a depositar para cuenta1: ");
		double montoDeposito=scanner.nextDouble();
		System.out.printf("%nsumando %.2f al saldo de la cuenta1%n%n", montoDeposito);
		cuenta1.depositar(montoDeposito);//sumando al saldo de cuenta1
		
		//muestra los saldos
		System.out.printf("Saldo de %s:$%.2f%n", cuenta1.obtenetNombre(), cuenta1.obtenerSaldo());
		System.out.printf("Saldo de %s:$%.2f%n%n", cuenta2.obtenetNombre(), cuenta2.obtenerSaldo());

		//depositando a la cuenta2
		System.out.println("Escriba el monto a depositar para cuenta2: ");
		montoDeposito=scanner.nextDouble();
		System.out.printf("%nSumando %.2f al saldo de cuenta2%n%n", montoDeposito);
		cuenta2.depositar(montoDeposito);
		
		//muestra los saldos
		System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenetNombre(), cuenta1.obtenerSaldo());
		System.out.printf("Saldo de %s: $%.2f%n", cuenta2.obtenetNombre(), cuenta2.obtenerSaldo());
		
		//retirando monto a cuenta1
		System.out.println("Escriba el monto a retirar para cuenta1: ");
		double montoRetiro=scanner.nextDouble();
		System.out.printf("%nRestando %.2f al saldo de la cuenta1%n%n",montoRetiro);
		cuenta1.retiro(montoRetiro);
		
		//muestra el nuevo saldo con el retiro
		System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenetNombre(), cuenta1.obtenerSaldo());
		
		
		
	}

}
