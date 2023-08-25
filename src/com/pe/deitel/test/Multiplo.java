package com.pe.deitel.test;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int numero1;
		int numero2;

		System.out.println("Ingrese el primer numero: ");
		numero1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		numero2 = scanner.nextInt();

		if (numero1 % numero2 == 0) {
			System.out.printf("el numero %s es multiplo del %s: ", numero1, numero2);

		} else
			System.out.printf("el numero %s NO es multiplo del %s: ", numero1, numero2);

	}

}
