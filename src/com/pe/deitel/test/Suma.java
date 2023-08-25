package com.pe.deitel.test;
/*programa que recibe dos numeros y muestra la suma */

import java.util.Scanner;

public class Suma {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int numero1;
		int numero2;
		int suma ;
		System.out.println("Escriba el primer entero");
		numero1=scanner.nextInt();
		
		System.out.println("Escriba el segundo entero");
		numero2=scanner.nextInt();
				
		suma=numero1+numero2;
		
		System.out.printf("La suma es %d", suma);

	}

}
