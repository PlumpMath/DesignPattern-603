package structure.abstractfactory;

public class IntelCPU implements CPU
{
	/**
	 * CPU的针脚数
	 */
	private int pins = 0;

	public IntelCPU(int pins)
	{
		super();
		this.pins = pins;
	}

	@Override
	public void calculate()
	{
		System.out.println("Intel CPU的针脚数：" + pins);
	}

}
