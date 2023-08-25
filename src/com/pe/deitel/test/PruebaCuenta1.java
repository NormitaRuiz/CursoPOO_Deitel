package com.pe.deitel.test;

import java.util.Scanner;

import com.pe.deitel.clases.Cuenta;

public class PruebaCuenta1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		Cuenta miCuenta = new Cuenta("Jane Green", 50.00);

		System.out.printf("El nombre inicial es: %s%n", miCuenta.obtenetNombre());

		System.out.println("Introduzca un nombre");
		String nombre = scanner.nextLine();
		miCuenta.establecerNombre(nombre);//coloca el nombre en mi cuenta
		System.out.println();//imprime una linea en blanco
		
		//muestra el nombre almacenado en el objeto mi cuenta
		miCuenta.obtenetNombre();
		System.out.printf("El nombre en el objeto miCuenta es: %n%s%n", miCuenta.obtenetNombre());

	}

}
