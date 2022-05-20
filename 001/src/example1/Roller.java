package example1;

public class Roller extends Circle {

	int hight;

	
	public Roller(double radius, int hight) {
		super(radius);
		this.hight = hight;
	}

	
	// Calculamos el volumen mediante la base y la altura
	public double calculateVolume() { return this.base() * this.hight; }
	
	// Calculamos la base
	public double base() { return 3.14 * this.radius * this.radius; }
	public double base2() { return Math.PI * Math.pow(this.radius, 2); }
	
	
	
	
	
	
	
	
	
	
	
}
