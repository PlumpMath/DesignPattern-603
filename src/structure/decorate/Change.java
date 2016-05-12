package structure.decorate;

public class Change implements TheGreatestSage
{
	private TheGreatestSage sage;

	public Change(TheGreatestSage sage)
	{
		this.sage = sage;
	}

	@Override
	public void move()
	{
		// 代码
		sage.move();
	}

}
