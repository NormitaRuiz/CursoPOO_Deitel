package com.pe.deitel.test;

import java.util.Scanner;

/*Compara enteros utilizando instrucciones if, operadores relacionales y de igualdad*/

public class Comparacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int numero1;
		int numero2;
		
		System.out.println("Escriba el primer entero: ");
		numero1=scanner.nextInt();
		System.out.println("Escriba el segundo entero: ");
		numero2=scanner.nextInt();
		
		if(numero1>numero2)
			System.out.printf("%d > %d%n",numero1,numero2);
		
		if(numero1<numero2)
			System.out.printf("%d < %d%n",numero1,numero2);
		
		if(numero1>=numero2)
			System.out.printf("%d >= %d%n",numero1,numero2);
		
		if(numero1<=numero2)
			System.out.printf("%d <= %d%n",numero1,numero2);
		
		if(numero1==numero2)
			System.out.printf("%d == %d%n",numero1,numero2);
		
		if(numero1!=numero2)
			System.out.printf("%d != %d%n",numero1,numero2);
		
		

	}

}
