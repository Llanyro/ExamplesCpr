package iterator.example;

public class Main {

	public static void main(String[] args) {
		VectorIterator it = new VectorIterator();
		
		it.addElement("Tomate");
		it.addElement(29);
		it.addElement(69.69);
		
		it.printCurrent();

		it.next();
		it.printCurrent();

		it.next();
		it.printCurrent();
		
		it.next();
		it.printCurrent();

		it.home();
		it.printCurrent();
	}

}
