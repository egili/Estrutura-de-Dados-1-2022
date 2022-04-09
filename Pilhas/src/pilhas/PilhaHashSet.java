package pilhas;

import java.util.HashSet;
import java.util.Set;

public class PilhaHashSet {

	private Set<Object> elements;
	private int lastElement;

	public PilhaHashSet() {
		this(10);
	}

	public PilhaHashSet(int size) {
		this.elements = new HashSet<Object>(size);
		this.lastElement = -1;
	}

	public PilhaHashSet(PilhaHashSet pilha) {

		pilha.elements = this.elements;
		pilha.lastElement = this.lastElement;
	}

	public void push(Object obj) throws Exception {

		if (!this.equals(obj) || obj == null)
			throw new Exception("Cannot insert a diferent object type in the stack");

		lastElement++;
		elements.add(obj);
	}

	public Object pop() throws Exception {

		if (isEmpty())
			throw new Exception("Can´t remove of empty stack");

		Object obj = elements.remove(elements.size() - 1);

		lastElement--;

		return obj;
	}

	public boolean isEmpty() {
		return lastElement == -1;
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

//		elements.forEach(pilha -> new ArrayList<Object>(this.elements).hashCode());
		
		for (Object obj : elements) 
			ret = ret * 21 + obj.hashCode();

		ret = ret * 13 + Integer.valueOf(this.lastElement).hashCode();

		return ret < 0 ? -ret : ret;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != PilhaHashSet.class)
			return false;

		PilhaHashSet pilha = (PilhaHashSet) obj;

		if (this.elements != pilha.elements)
			return false;
		if (this.lastElement != pilha.lastElement)
			return false;

		return true;
	}
}
