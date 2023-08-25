package com.pe.deitel.test;

import java.util.Scanner;
/*Escriba una aplicación que reciba del usuario un número compuesto por cinco dígitos, 
 que separe ese número en sus dígitos individuales y los imprima, cada uno separado de los demás
por tres espacios. Por ejemplo, si el usuario escribe el número 42339, el programa debe imprimir*/

public class SeparacionDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int numero;
//		boolean restriccion;

		do {

			System.out.println("Ingrese numero de 5 digitos");
			numero = scanner.nextInt();
//			if ((numero <= 9999 || numero > 99999)) {
//				restriccion = true;
//			} else
//				restriccion = false;

		} while (numero <= 9999 || numero > 99999);

		String numeroDigitos;
		int digito1 = numero / 10000;
//		System.out.println(digito1);
		int digito2 = numero % 10000 / 1000;
//		System.out.println(digito2);
		int digito3 = numero % 1000 / 100;
//		System.out.println(digito3);
		int digito4 = numero % 100 / 10;
//		System.out.println(digito4);
		int digito5 = numero % 10;
//		System.out.println(digito5);
		numeroDigitos = digito1 + ", " + digito2 + ", " + digito3 + " ," + digito4 + " ," + digito5;

		System.out.println(numeroDigitos);

	}

}
