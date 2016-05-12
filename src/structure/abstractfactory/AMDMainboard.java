package structure.abstractfactory;

public class AMDMainboard implements Mainboard
{
	/**
	 * CPU插孔个数
	 */
	private int cpuHoles = 0;

	/**
	 * 构造方法，传入CPU插孔个数
	 * @param cpuHoles
	 */
	public AMDMainboard(int cpuHoles)
	{
		this.cpuHoles = cpuHoles;
	}

	@Override
	public void installCPU()
	{
		System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
	}

}
