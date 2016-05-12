package structure.decorate;

public class Bird extends Change
{

	public Bird(TheGreatestSage sage)
	{
		super(sage);
	}

	@Override
	public void move()
	{
		super.move();
		// 代码
		System.out.println("Bird Move");
	}

}
