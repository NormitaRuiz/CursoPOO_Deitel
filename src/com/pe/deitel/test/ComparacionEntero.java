package com.pe.deitel.test;

import java.util.Scanner;

public class ComparacionEntero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int mayor;
		int menor;

		System.out.println("Ingrese el primer numero: ");
		numero1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		numero2 = scanner.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		numero3 = scanner.nextInt();
		System.out.println("Ingrese el cuarto numero: ");
		numero4 = scanner.nextInt();
		System.out.println("Ingrese el quinto numero: ");
		numero5 = scanner.nextInt();

		if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5) {

			mayor = numero1;

			System.out.printf("El numero %d es mayor %n", mayor);

		} else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5) {

			mayor = numero2;

			System.out.printf("El numero %d es mayor %n", mayor);

		} else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5) {

			mayor = numero3;

			System.out.printf("El numero %d es mayor %n", mayor);

		} else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5) {
			mayor = numero4;
			System.out.printf("El numero %d es mayor %n", mayor);

		} else
			mayor = numero5;
			System.out.printf("El numero %d es mayor %n", mayor);

	}
	
	
}
