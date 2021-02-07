import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ICICIBank bank=new ICICIBank();
		System.out.println("Enter Account Number: ");
		int AccountNumber=sc.nextInt();
		System.out.println("Enter the Amount for Withdrawal: ");
		int Amount=sc.nextInt();
		int Balance=10000;
		try
		{	
			Balance=Balance-Amount;
			System.out.println("Balance= "+ bank.withdrawAmount(AccountNumber,Amount,Balance));
			
		}
		catch(InvalidAccountNumberException iae)
		{
			System.out.println("Invalid Account Number");
		}

	}

}
