import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FieReaderExample {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Hp\\Desktop\\capgemini\\11.1.2020\\Enum.txt"));
		
		String data=br.readLine();
		
		while(data!=null)
		{
			System.out.println(data);
			data=br.readLine();
		}
		
		br.close();

	}

}
