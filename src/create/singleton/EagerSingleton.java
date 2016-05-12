package create.singleton;

public class EagerSingleton
{
	private static EagerSingleton instance = new EagerSingleton();

	/**
	 * 私有构造函数
	 */
	private EagerSingleton()
	{

	}

	/**
	 * 静态工厂方法
	 * @return
	 */
	public static EagerSingleton getInstance()
	{
		return instance;
	}
}
