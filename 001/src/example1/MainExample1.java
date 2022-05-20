package example1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MainExample1 {

	public static void main(String[] args) {
		
		double value1 = 10.1;
		int value2 = 10;
		
		// Obtenemos los valores segun el fichero
		try {
			String valores = readFile("./file2.txt");
			String[] valoresDivididos = valores.split(" ");
			
			/*
			 * "10.1 10"
			 * 
			 * "10.1" "10"
			 * */
			
			// valoresDivididos[0] => "10.1"
			// valoresDivididos[1] => "10"
			
			value1 = Double.parseDouble(valoresDivididos[0]);
			value2 = Integer.parseInt(valoresDivididos[1]);
			
			System.out.println("Valor1: " + value1);
			System.out.println("Valor2: " + value2);
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		//Circle c1 = new Circle(10);
		// Inicializamos el objeto Cilindo
		Roller r = new Roller(value1, value2);
		
		// Imprimimos el volumen
		System.out.println("Volumen: " + r.calculateVolume());
		
		
		// Hacemos que lo escriba a un fichero
		try {
			writeFile("./file.txt", "" + r.calculateVolume());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static String readFile(String filename) throws IOException {
		return Files.readString(Path.of(filename));
	}
	static void writeFile(String filename, String content) throws IOException {
		Files.writeString(Path.of(filename),content, StandardOpenOption.CREATE);
	}
	

}
