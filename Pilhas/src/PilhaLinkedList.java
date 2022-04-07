import java.util.LinkedList;
import java.util.List;

public class PilhaLinkedList {

	private List<Object> elements = new LinkedList<Object>();

	public void push(Object obj) throws Exception {
		if (obj == null)
			throw new Exception("null object");

		elements.add(obj);
	}

	public Object pop() throws Exception {
		
		if (isEmpty())
			throw new Exception("can´t remove of empty stack");

		return elements.remove(elements.size() - 1);
	}

	public boolean isEmpty() {
		return elements.isEmpty();
	}

	@Override
	public String toString() {
		return elements.toString();
	}
}
