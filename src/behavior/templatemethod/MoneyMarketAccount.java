package behavior.templatemethod;

public class MoneyMarketAccount extends Account
{

	@Override
	public String doCalculateAccountType()
	{
		return "Money Market";
	}

	@Override
	public double doCalculateInterestRate()
	{
		return 0.045;
	}

}
