package structure.abstractfactory;

public class AMDCPU implements CPU
{
	/**
	 * CPU针脚个数
	 */
	private int pins = 0;

	public AMDCPU(int pins)
	{
		super();
		this.pins = pins;
	}

	@Override
	public void calculate()
	{
		System.out.println("AMD CPU的针脚数：" + pins);
	}

}
