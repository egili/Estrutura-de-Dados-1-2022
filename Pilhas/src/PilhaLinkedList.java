import java.util.LinkedList;
import java.util.List;

public class PilhaLinkedList {

	private List<Object> elements = new LinkedList<Object>();

	public Object pop() {
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
