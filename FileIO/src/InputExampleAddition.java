import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExampleAddition {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers for addition");
		String s1=br.readLine();
		String s2=br.readLine();
		
		int i1=Integer.parseInt(s1);
		int i2=Integer.parseInt(s2);
		System.out.println("Addition of two numbers is " + (i1+i2));

	}

}
