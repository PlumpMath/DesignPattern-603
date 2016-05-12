package behavior.templatemethod;

public class CDAccount extends Account
{

	@Override
	public String doCalculateAccountType()
	{
		return "Certificate of Deposite";
	}

	@Override
	public double doCalculateInterestRate()
	{
		return 0.06;
	}

}
