package com.java.lang.patata2;

public class Cubo {
	
	// Lo puede modificar solo la clase Cubo
	private int a;
	// Lo puede modificar solo esta clase y sus hijos
	protected int b;
	// Puede modificarlo cualquiera
	public int c;
	// (package) Puede modificarlo cualquiera del paquete
	int d;
	
	
	// Atributos
	private int caras;
	private int volumen;
	
	
	
	int sum() {
		return caras + volumen;
	}
	
	// void = funcion que no devuelve nada
	public void setCaras(int caras) { this.caras = caras; }
	// ** Otros ejemplos **
	// public void setCaras2(int value) { this.caras = value; }
	// public void setCaras3(int value) { caras = value; }
	
	// Para exteriormente recibir el valor de un atributo
	public int getCaras() { return this.caras; }

	
	
	
	
}
