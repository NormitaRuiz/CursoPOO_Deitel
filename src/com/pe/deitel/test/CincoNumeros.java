package com.pe.deitel.test;

import java.util.Scanner;

public class CincoNumeros {

	static int  contadorPostivo = 0;
	static int  contadorNegativo = 0;
	static int  contadorCero = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero1");
		double numero1 = scanner.nextDouble();
		System.out.println("Ingrese numero2");
		double numero2 = scanner.nextDouble();
		System.out.println("Ingrese numero3");
		double numero3 = scanner.nextDouble();
		System.out.println("Ingrese numero4");
		double numero4 = scanner.nextDouble();
		System.out.println("Ingrese numero5");
		double numero5 = scanner.nextDouble();
	
		calificarNumero(numero1);
		calificarNumero(numero2);
		calificarNumero(numero3);
		calificarNumero(numero4);
		calificarNumero(numero5);

	
		
		System.out.println(contadorPostivo);
		System.out.println(contadorNegativo);
		System.out.println(contadorCero);
		

	}
	
	public static void calificarNumero(double numero) {
		if (numero > 0) {
			contadorPostivo = contadorPostivo + 1;
		} else if (numero < 0) {
			contadorNegativo = contadorNegativo + 1;
		} else {
			contadorCero = contadorCero + 1;
		}
	}

}
