package com.pe.deitel.clases;

import java.security.PrivilegedActionException;

public class Tiempo1 {

	private int hora; // 0 - 23
	private int minuto; // 0 - 59
	private int segundo; // 0 - 59

	public void establecerTiempo(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;

		if (hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 || segundo < 0 || segundo >= 60) {

			throw new IllegalArgumentException("hora, minuto y/o segundo estaban fuera de rango");
		}
	}

	public String aStringUniversal() {
		return String.format("%02d:%02d:%02d”, hora, minuto, segundo");
	}
	

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hora == 0 || hora == 12) ? 12 : hora % 12), minuto, segundo,
				(hora < 12 ? "AM" : "PM"));
	}

}
