package com.java.lang.patata;

import com.java.lang.patata2.Cubo;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		String a;
		Object b;
		
		// Para cadenas de caracteres
		String patata = "String contenido";

		// Para numeros enteros
		int num = 10;
		
		// Es igual que int pero en objeto
		Integer num2 = 100;
		
		
		
		//////// ******* Objetos ********
		
		// Como inicializar un objeto
		// Any name = new Any();
		com.java.lang.patata.Cubo cubo = new com.java.lang.patata.Cubo();
		
		// Inicializamos los atributos de la clase
		cubo.caras = 10;
		cubo.volumen = 9;
		
		// Utilizamos una funcion de la propia clase
		int resultadoSuma = cubo.sum();
		
		// Imprimimos por pantalla el resultado
		System.out.println("Resultado: " + resultadoSuma);
		
		// ****************** Objeto 2 ********************** //
		
		com.java.lang.patata2.Cubo cubo2 = new com.java.lang.patata2.Cubo();

		// Hacemos que el atributo de caras sea 10 mediante una funcion interna de Cubo
		cubo2.setCaras(10);
		
		// Esto no se puede hacer por que es 'private'
		// cubo2.caras = 10;
		System.out.println("Caras: " + cubo2.getCaras());

		
		// Imprime el string y al acabar imprime un salto de linea
		System.out.println("Hola");
		// Imprime solo el string
		System.out.print("Hola");

		
		
	}
	
	
	
}
