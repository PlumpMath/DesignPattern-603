package behavior.strategy;

public class AdvancedMemberStrategy implements MemberStrategy
{

	@Override
	public double calcPrice(double booksPrice)
	{
		System.out.println("对于高级会员折扣为20%");
		return booksPrice * 0.8;
	}
}
