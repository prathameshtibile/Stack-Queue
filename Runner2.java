package Stack_Queue;

public class Runner2
{
	public static void main(String[] args)
	{
		Stack2<Integer> stack = new Stack2<Integer>();
		System.out.println("Elements in the stack :");
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.show();
		System.out.println();
		while (stack.peek() != null) 
		{
			System.out.println("Remaining elements in the stack after pop " + stack.peek());
			stack.pop();
			stack.show();
		}
	}
}
