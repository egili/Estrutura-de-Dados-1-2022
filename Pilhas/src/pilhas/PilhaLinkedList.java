package pilhas;

import java.util.LinkedList;
import java.util.List;

public class PilhaLinkedList {

	private List<Object> elements = new LinkedList<Object>();
	
	public PilhaLinkedList(PilhaLinkedList pilha) throws Exception{
		
		if(pilha == null)
			throw new Exception("invalid object");
		
		this.elements = pilha.elements;;
	}
	
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
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != PilhaLinkedList.class)
			return false;

		PilhaLinkedList pilha = (PilhaLinkedList) obj;

		if (this.elements != pilha.elements)
			return false;

		return true;
	}
	
	@Override
	public int hashCode() {
		
		int ret = 13;
		
		for (Object obj : elements) 
			ret = ret * 21 + obj.hashCode();
		
		return ret > 0 ? ret : -ret;
	}
}
