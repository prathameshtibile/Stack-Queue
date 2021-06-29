package Stack_Queue;

public class Queue3<T> {
	LinkedList3<T> list = new LinkedList3<T>();

	/**
	 * Add elements to the queue
	 * 
	 * @param value
	 */
	public void enqueue(T value) {
		list.add(value);
	}

	/**
	 * It is looping through the nodes and printing their values till the last
	 * node's next element is null
	 */
	public void show() {
		list.show();
	}
}
