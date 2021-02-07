
public class ICICIBank {

	public int withdrawAmount(int AccountNumber,int Amount, int Balance)throws InvalidAccountNumberException
	{
		if(AccountNumber<100 || AccountNumber>500)
		{
			throw new InvalidAccountNumberException();
		}
		else if(Balance<0)
		{
			System.out.println("Out of balance pls add money");
		}
		else 
		{
			System.out.println("Succesfull Operation");
		}
		return Balance;
		
	}
}
