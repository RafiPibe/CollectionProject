import java.util.LinkedList;
import java.util.Stack;

public class linkedListStack {

	public static void main(String[] args) {
		LinkedList<String> s = new LinkedList<>();

		s.add("Kuda");
        s.add("Gajah");
        s.add("Sapi");
        s.add("Zebra");

		System.out.println("LinkedList (Stack)" + s);
        s.removeLast();
        System.out.println("After pop" + s);
	}
}
