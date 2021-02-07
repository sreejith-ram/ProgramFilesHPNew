import java.util.Stack;

public class Warehouse {
	Stack<Integer> goods=new Stack<>();
	public void addition(int num)
	{
		System.out.println("Item added"+goods.push(num));
	}
	public void removeItem()
	{
		System.out.println("Item remved: "+goods.pop());
	}
}
