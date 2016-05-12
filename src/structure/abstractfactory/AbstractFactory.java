package structure.abstractfactory;

public interface AbstractFactory
{
	/**
	 * 创建CPU对象
	 * @return CPU对象
	 */
	public CPU createCPU();

	/**
	 * 创建主板对象
	 * @return 主板对象
	 */
	public Mainboard createMainboard();
}
