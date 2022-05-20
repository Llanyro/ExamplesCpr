package iterator.example;

import java.util.ArrayList;
import java.util.List;

public class VectorIterator implements Iterator {
	// Posicion donde estamos
	private int n;
	// Lista de objetos que guardamos
	private List<Object> list = new ArrayList<>();
	
	
	// Agrega un elemento a la lista de elementos
	@Override
	public void addElement(Object object) {
		this.list.add(object);
	}

	// Imprime por pantalla el objeto que esta mirando actualmente en formato String
	@Override
	public void printCurrent() throws IndexOutOfBoundsException {
		System.out.println(this.list.get(n).toString());
	}
	
	// Devuelve true si el tamanio es mayor a 0
	// boolean = True / False (1 / 0)
	@Override
	public boolean theresMore() { return this.list.size() > 0; }

	@Override
	public void next() {
		this.n++;
		if(this.n >= this.list.size())
			this.home();
	}
	@Override
	public void home() { this.n = 0; }


}
