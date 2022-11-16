import java.util.LinkedList;
import java.util.Queue;

public class linkedListQueue {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();

		q.add("Kuda");
        q.add("Gajah");
        q.add("Sapi");
        q.add("Zebra");

		System.out.println("LinkedList (Queue)" + q);
        q.remove();
		System.out.println("after dequeue:" + q);
	}
}
