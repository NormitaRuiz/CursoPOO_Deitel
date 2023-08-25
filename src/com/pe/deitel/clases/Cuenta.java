package com.pe.deitel.clases;

public class Cuenta {

	private String nombre;
	private double saldo;

	public Cuenta(String nombre, double saldo) {
		this.nombre = nombre;
		if (saldo > 0.0) {// valida que el saldo sea mayor que 0.0; de lo contrario la variable de
							// instancia saldo
			this.saldo = saldo;// mantiene su valor inicial predeterminado de 0.0
		}

	}
	
	/* Modifique la clase Cuenta (figura 3.8) para proporcionar un método llamado
	retirar, que retire dinero de un objeto Cuenta. Asegúrese de que el monto a retirar no exceda el saldo de Cuenta. 
	Si 	lo hace, el saldo debe permanecer sin cambio y el método debe imprimir un mensaje que
	 indique “El monto a retirar excede el saldo de la cuenta”. Modifique la clase PruebaCuenta para probar el método retirar.*/
	
	public void retiro(double montoRetiro) {
		
		if(montoRetiro<saldo) {
			saldo=saldo-montoRetiro;
		}else {
			System.out.println("El monto a retirar excede el saldo de la cuenta");
		}
			
		
	}

	public void depositar(double montoDeposito) {
		if (montoDeposito > 0.0) {//si el montoDeposito es valido
			saldo = saldo + montoDeposito;//lo suma al saldo
		}
	}

	public double obtenerSaldo() {
		return saldo;
	}

	// metodo para establecer el nombre
	public void establecerNombre(String nombre) {
		this.nombre = nombre; // almacenar nombre

	}

	// metodo que devuelve el nombre
	public String obtenetNombre() {

		return nombre;// devuelve el valor de nombre a quien lo invoco
	}

}
