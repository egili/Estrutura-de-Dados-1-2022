import java.util.ArrayList;
import java.util.List;

public class Pilha {

	private List<Object> elements;
	private int lastElement;
	
	public Pilha() {
		elements = new ArrayList<Object>(10);
		lastElement = -1;
	}
	
	public Pilha(int size) throws Exception {
		
		if(size < 0)
			throw new InvalidSizeException("Invalid size");
		
		elements = new ArrayList<Object>(size);
		lastElement = -1;
	}
	
	public Pilha(Pilha pilha) throws Exception {
		
		if(pilha == null)
			throw new Exception("Invalid object value");
		
		pilha.elements = this.elements;
		pilha.lastElement = this.lastElement;
	}
	
	public void push(Object obj) throws Exception {
		
		if(!this.equals(obj) || obj == null)
			throw new Exception("Cannot insert a diferent object type in the stack");
		
		lastElement++;
		elements.add(obj);
	}
	
	public Object pop () throws Exception {

		if(isEmpty())
			throw new Exception("Can´t remove of empty stack");
		
		Object obj = elements.remove(elements.size() - 1);
		
		lastElement--;
		
		return obj;
	}
	
	public boolean isEmpty() {
		return elements.size() == 0;
	}
	
	public boolean isFull() {
		return lastElement == elements.size();
	}
	
	public Object peek() {
		return !this.isEmpty() ? lastElement : null;
	}
	
	@Override
	public String toString() {
		 return "Stack [elements= " + elements + "]";
	}
	
	@Override
	public int hashCode() {
		
		int ret = 31;
		
		elements.forEach((pilha) -> new ArrayList<Object>(this.elements).hashCode());
		
		ret = ret * 13 + Integer.valueOf(this.lastElement).hashCode();
		
		return ret < 0 ? -ret : ret;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;
		if(obj.getClass() != Pilha.class)
			return false;
		
		Pilha pilha = (Pilha) obj; 
		
		if(this.elements != pilha.elements)
			return false;
		if(this.lastElement != pilha.lastElement)
			return false;
		
		return true;
	}
}
