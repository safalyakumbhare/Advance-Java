import java.util.*;
public class TestJavaCollection4 {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Suar");
		stack.push("Amit");
		stack.push("Mard");
		stack.push("Moti");
		stack.pop();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}