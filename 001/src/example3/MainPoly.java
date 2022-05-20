package example3;

import java.util.Iterator;

public class MainPoly {
	public static void main(String[] args) {
		
		// Buecle sencillo con for
		// Utiliza un array de 'double' para guardar datos de cada cara
		// Recorre todas las caras y suma sus valores
		
		
		int n = 3;
		double temp = 0;
		double[] face = new double[n];
		
		face[0] = 7;
		face[1] = 3;
		face[2] = 4;
		
		for (int i = 0; i < n; i++) {
			//temp = temp + face[i];
			temp += face[i];
			
			System.out.println("Valor i:" + i);
			System.out.println("Valor temp:" + temp);
			System.out.println("Valor face[i]:" + face[i]);
			System.out.println("");
		}
	}
}
