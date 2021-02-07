import java.util.LinkedList;

public class ICICIBank {
	
	LinkedList<Account> accounts=new LinkedList<>();
	
	public String createAccount(int accountNumber, int amount)
	{
		Account account=new Account();
		account.setAccountNumber(accountNumber);
		account.setAmount(amount);
		accounts.add(account);
		return "Account created succefully";
	}
	
	private Account searchAccount(int accountNumber) throws InvalidAccountNumberException
	{
		for(Account account:accounts)
		{
			if(accountNumber==account.getAccountNumber())
			{
				return account;
			}
		}
		throw new InvalidAccountNumberException();
	}
	
	public int withdrawAmount(int accountNumber, int amount) throws InvalidAccountNumberException, InsufficientBalanceException
	{
		Account account = searchAccount(accountNumber);
		
		if((account.getAmount()-amount)>=0)
		{
			account.setAmount(account.getAmount()-amount);
			return account.getAmount();
		}
		throw new InsufficientBalanceException();
	}
	


}
