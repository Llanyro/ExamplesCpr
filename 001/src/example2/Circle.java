package example2;

public abstract class Circle {
	// Atributos
	protected double radius;
	
	// Constructor base
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// Funcion abstracta sin definir que debe ser heredada y definida en el hijo
	public abstract double base();
	// Funcion definida que va a ser heredada
	public int getValor() { return 10; }
}
