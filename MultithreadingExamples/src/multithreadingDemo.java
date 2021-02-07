class myThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Child Thread");
		}
	}
}
public class multithreadingDemo {

	public static void main(String[] args) {
		
		myThread m=new myThread();
		m.start();
		m.start();
		System.out.println(m.getName());

	}

}
