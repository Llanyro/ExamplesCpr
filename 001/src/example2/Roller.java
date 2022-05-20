package example2;

public class Roller extends Circle implements Interfaz1 {
	int hight;

	public Roller(double radius, int hight) {
		super(radius);
		this.hight = hight;
	}

	
	// Calculamos el volumen mediante la base y la altura
	public double calculateVolume() { return this.base() * this.hight; }


	// Calculamos la base
	@Override
	public double base() { return 3.14 * this.radius * this.radius; }


	@Override
	public double base2() {
		return 0;
	}


	@Override
	public double base3() {
		return 0;
	}
}
