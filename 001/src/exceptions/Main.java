package exceptions;

public class Main {

	public static void main(String[] args) {
		
		int b = 0;
		
		// Lo intenta ejecutar
		try {
			double result = 10 / b;
			System.out.println("Resultado = " + result);
		}
		// Se ejecuta si lo de arriba peta
		catch (Exception e) {
			//System.out.println(e);
			
			System.out.println("Tu, que estas dividiendo entre 0!");
		}
		// Siempre se ejecuta al final
		finally {
			System.out.println("Fin!");
		}
		
		
		try {
			exampleException1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	static void exampleException1() throws Exception {
		throw new Exception("Error!");
		//System.out.println("AAAAAAAAA");
	}
	
	

}
