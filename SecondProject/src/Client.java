
public class Client {

	public static void main(String[] args) {
		ICICIBank bank=new ICICIBank();
		
		System.out.println(bank.createAccount(101, 3000));
		System.out.println(bank.createAccount(102, 3000));
		
		try
		{
			System.out.println("Balance= "+bank.withdrawAmount(101, 2000));
		}
		catch(InvalidAccountNumberException ian)
		{
			System.out.println("Invalid Account Number, Please check the Acoount Number");
		}
		catch(InsufficientBalanceException ibe)
		{
			System.out.println("Insufficient Balance, Check the balance");
		}

	}

}
