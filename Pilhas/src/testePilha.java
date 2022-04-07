import java.util.Stack;

public class testePilha {

	public static void main(String[] args) {

//		PilhaVetorInteiros p = null;
//		try {
//			p = new PilhaVetorInteiros(3);
//			
//			System.out.println(p.toString());
//			
//			p.push(1);
//			p.push(1);
//			p.push(1);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		Stack<Integer> s = new Stack<>();
		System.out.println(s.empty());
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);

		System.out.println(s);
		
		System.out.println(s.peek());
		
		s.remove(3);
		System.out.println(s);
	}
}
