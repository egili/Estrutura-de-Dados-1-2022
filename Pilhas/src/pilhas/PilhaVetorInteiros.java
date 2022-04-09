package pilhas;

public class PilhaVetorInteiros {

	protected int[] elements;
	protected int lastElement;

	public PilhaVetorInteiros() throws Exception {
		this(10);
	}

	public PilhaVetorInteiros(int size) throws Exception {

		if (size < 0)
			throw new InvalidSizeException("Invalid size");

		elements = new int[size];
		lastElement = -1;
	}

	public PilhaVetorInteiros(PilhaVetorInteiros pilha) throws Exception {

		if (pilha == null)
			throw new Exception("Invalid object value");

		pilha.elements = this.elements;
		pilha.lastElement = this.lastElement;
	}

	public void push(int element) throws Exception {

		if (isFull())
			throw new Exception("Can´t add on full stack");

		lastElement++;
		elements[lastElement] = element;
	}

	public int pop() throws Exception {

		if (isEmpty())
			throw new Exception("Can´t remove of empty stack");

		int ret = elements[lastElement];
		lastElement--;
		return ret;
	}

	public boolean isEmpty() {
		return lastElement == -1;
	}

	public boolean isFull() {
		return lastElement == elements.length - 1;
	}

	public int peek() throws Exception {

		if (lastElement == -1)
			throw new Exception("Can´t get peek value of an empty stack");

		return elements[lastElement];
	}

	@Override
	public int hashCode() {

		int ret = 31;

		for (int i : elements) 
			ret = ret * 13 + Integer.valueOf(i).hashCode();

		ret = ret * 13 + Integer.valueOf(this.lastElement).hashCode();

		return ret < 0 ? -ret : ret;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != PilhaVetorInteiros.class)
			return false;

		PilhaVetorInteiros pilha = (PilhaVetorInteiros) obj;

		if (this.elements != pilha.elements)
			return false;
		if (this.lastElement != pilha.lastElement)
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "Stack [elements= " + elements + "]";
	}
}
