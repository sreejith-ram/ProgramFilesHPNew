
public class MultipleCatchinTry {

	public static void main(String[] args) {
		String s=null;
		int a=5;
		int b=0;
		int[] ary= {1,2,3};
		
		try 
		{
			int div=a/b;
			System.out.println("Division of two numbers: "+div);
			System.out.println("Length of the string is: "+s.length());
			ary[3]=5;
			System.out.println(ary[3]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception");
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException aoe)
		{
			System.out.println("Array out of bound");
			System.out.println(aoe.getMessage());
		}
		catch(NullPointerException ne)
		{
			System.out.println("Null pointer exception");
			System.out.println(ne.getMessage());
		}
		finally
		{
			System.out.println("Finally body");
		}

	}

}
