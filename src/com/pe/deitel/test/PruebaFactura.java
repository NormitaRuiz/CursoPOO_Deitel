package com.pe.deitel.test;

import com.pe.deitel.clases.Factura;

public class PruebaFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factura factura = new Factura("2", "fierro", 20, 36.50);
		factura.obtenerMontoFactura();
		System.out.println("El monto ");

	}

}
