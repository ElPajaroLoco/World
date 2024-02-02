package paq_1_1;

public class List<T extends Object> {
	private int def = 10;
	private int counter;
	public T[] elem;
	
	public List() {
		this.counter = 0;
		this.elem = (T[]) new Object[def];
	}
	
	public void addElem(T t) {
		this.elem[counter++] = t;
	}
	
	public T getElem(int idx) {
		return elem[idx];
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i < counter; i++)
			str.append(elem[i].toString());
		
		return str.toString();
	}
}
