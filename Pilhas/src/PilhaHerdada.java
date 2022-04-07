import java.util.Stack;

public class PilhaHerdada extends Stack<Object> { // Stack class extends Vector

	@Override
	public Object push(Object obj) {
		return super.push(obj);
	}

	@Override
	public synchronized Object pop() {
		return super.pop();
	}

	@Override
	public synchronized Object peek() {
		return super.peek();
	}
	
	@Override
	public boolean empty() {
		return super.empty();
	}
	
	@Override
	public synchronized int search(Object o) {
		return super.search(o);
	}
}
