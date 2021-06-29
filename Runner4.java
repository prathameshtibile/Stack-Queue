package Stack_Queue;

public class Runner4 {
	public static void main(String[] args) {
		Queue4<Integer> queue = new Queue4<Integer>();
		queue.enqueue(56);
		queue.enqueue(70);
		queue.enqueue(30);
		System.out.println("Array before dequeue");
		queue.show();
		queue.dequeue();
		System.out.println("Array after dequeue");
		queue.show();
	}
}
