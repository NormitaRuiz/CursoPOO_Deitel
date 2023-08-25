package com.pe.deitel.test;

import com.pe.deitel.clases.Tiempo1;

public class PruebaTiempo1 {

	public static void main(String[] args) {
		
		Tiempo1 tiempo=new Tiempo1();
		
		//imprime representaciones de cadena del tiempo
		mostrarTiempo("Despues de crear el objeto tiempo", tiempo);
		System.out.println();
		
		//modifica el tiempo e imprime el tiempo actualizado
		tiempo.establecerTiempo(13,27, 6);
		mostrarTiempo("Despuesde crear el objeto tiempo", tiempo);
		System.out.println();
		
		try {
			tiempo.establecerTiempo(99,99,99);
			
		} catch (IllegalArgumentException e) {
			System.out.printf("Excepcion: %s%n%n",e.getMessage());
		}
		
		mostrarTiempo("Despuesde de llamar a establecerTiempo con valores invalidos", tiempo);

	}
		//muestra un objeto tiempo1 en formatos de 24 horas y 12 horas
		private static void mostrarTiempo(String encabezado, Tiempo1 t) {
		System.out.printf("%s%n Tiempo universal:%s%n Tiempo estandar:%s%n", encabezado, t.aStringUniversal(), t.toString());
		
	}

	

}
