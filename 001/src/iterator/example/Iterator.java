package iterator.example;

public interface Iterator {
	// Agrega un elemento a la lista de elementos
	void addElement(Object object);
	// Imprime por pantalla el objeto que esta mirando actualmente en formato String
	void printCurrent();
	// Devuelve true si el tamanio es mayor a 0
	// boolean = True / False (1 / 0)
	boolean theresMore();
	// Suma 1 a n
	void next();
	// Setea n a 0
	public void home();
}
