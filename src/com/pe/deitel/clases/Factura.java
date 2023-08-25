package com.pe.deitel.clases;

public class Factura {

	private String numeroPieza;
	private String descripcion;
	private int cantidad;
	private double precio;

	public Factura(String numeroPieza, String descripcion, int cantidad, double precio) {
		this.numeroPieza = numeroPieza;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;

	}

	public String obtenerNumeroPieza() {
		return numeroPieza;
	}

	public void establecerNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}

	public String obtenerDescripcion() {
		return descripcion;
	}

	public void establecerDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int obtenerCantidad() {
		return cantidad;
	}

	public void establecerCantidad(int cantidad) {

		if (cantidad < 0) {
			cantidad = 0;
		} else
			this.cantidad = cantidad;
	}

	public double obtenerPrecio() {
		return precio;
	}

	public void establecerPrecio(double precio) {
		
		if(precio<0.0) {
			precio=0.0d;
		}
		this.precio = precio;
	}

	public void obtenerMontoFactura() {

		double factura = cantidad * precio;
		System.out.println("El monto de la factura total es: "+factura);

	}

}
